package enums;

public enum Gearbox {
    Manual (1),
    Automatic (2);

    private final int type;

    Gearbox(int type) {
        this.type = type;
    }
}
