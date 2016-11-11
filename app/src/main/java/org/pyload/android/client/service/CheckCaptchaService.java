package org.pyload.android.client.service;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.AsyncTask;
import android.os.Binder;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import org.apache.thrift.TException;
import org.pyload.android.client.R;
import org.pyload.android.client.pyLoad;
import org.pyload.android.client.pyLoadApp;
import org.pyload.thrift.Pyload;

/**
 * Background Service checking for new captchas
 */
public class CheckCaptchaService extends Service {

    public static final int NOTIFICATION_ID = 1000;

    private pyLoadApp app;
    private Pyload.Client client;
    private final IBinder mBinder = new CheckCaptchaBinder();

    @Override
    public void onCreate() {
        Log.d("pyLoad", "create CaptchaService");
        app = new pyLoadApp();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("pyLoad", "Captcha check service");
        app.prefs = PreferenceManager.getDefaultSharedPreferences(this);
        app.notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        AsyncTask<Void, Void, Void> asyncTask = new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {
                Log.d("pyLoad", "getting client in background");
                try {
                    client = app.getClient();
                    boolean isCaptchaWaiting = false;
                    synchronized (client) {
                        isCaptchaWaiting = client.isCaptchaWaiting();
                    }
                    if (isCaptchaWaiting) {
                        showNotification();
                    }
                } catch (TException e) {
                    Log.e("pyLoad", "Thrift problem", e);
                }
                return null;
            }
        };
        asyncTask.execute();
        return START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d("pyLoad", "CaptchaBinder");
        return mBinder;
    }

    public class CheckCaptchaBinder extends Binder {
        CheckCaptchaService getService() {
            return CheckCaptchaService.this;
        }
    }

    private void showNotification() {
        // The PendingIntent to launch our activity if the user selects this notification
        PendingIntent contentIntent;
        contentIntent = PendingIntent.getActivity(this, 0,
                new Intent(this, pyLoad.class), 0);

        // Build notification
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_launcher)
                .setContentTitle(getText(R.string.app_name))
                .setContentText(getText(R.string.retrieve_captcha))
                .setContentIntent(contentIntent)
                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));
        Notification notification = builder.build();

//        // Set the info for the views that show in the notification panel.
//        notification.setLatestEventInfo(this, getText(R.string.app_name),
//                getText(R.string.retrieve_captcha), contentIntent);

        // Send the notification.
        app.notificationManager.notify(NOTIFICATION_ID, notification);

        // disable repeating background service, as we notify now
        ((AlarmManager) getSystemService(ALARM_SERVICE)).cancel(PendingIntent.getService(
                this.getApplication(), 0, new Intent(this.getApplication(),
                        CheckCaptchaService.class), 0));
    }
}