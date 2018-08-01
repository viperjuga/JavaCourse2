package enums;

public enum GearboxType {
    Manual (1),
    Automatic (2);

    private final int type;

    GearboxType(int type) {
        this.type = type;
    }

    public int getValue() {
        return type;
    }
}
