package enums;

public enum CarStatus {
    Reserved (1),
    Running (2),
    Returned (3),
    Canceled (4);

    private final int type;

    CarStatus(int type) {
        this.type = type;
    }

    public int getValue() {
        return type;
    }
}
