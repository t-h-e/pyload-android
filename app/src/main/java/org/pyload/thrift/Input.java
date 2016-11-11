/**
 * Autogenerated by Thrift Compiler (0.9.3)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package org.pyload.thrift;


public enum Input implements org.apache.thrift.TEnum {
    NONE(0),
    TEXT(1),
    TEXTBOX(2),
    PASSWORD(3),
    BOOL(4),
    CLICK(5),
    CHOICE(6),
    MULTIPLE(7),
    LIST(8),
    TABLE(9);

    private final int value;

    private Input(int value) {
        this.value = value;
    }

    /**
     * Get the integer value of this enum value, as defined in the Thrift IDL.
     */
    public int getValue() {
        return value;
    }

    /**
     * Find a the enum type by its integer value, as defined in the Thrift IDL.
     * @return null if the value is not found.
     */
    public static Input findByValue(int value) {
        switch (value) {
            case 0:
                return NONE;
            case 1:
                return TEXT;
            case 2:
                return TEXTBOX;
            case 3:
                return PASSWORD;
            case 4:
                return BOOL;
            case 5:
                return CLICK;
            case 6:
                return CHOICE;
            case 7:
                return MULTIPLE;
            case 8:
                return LIST;
            case 9:
                return TABLE;
            default:
                return null;
        }
    }
}