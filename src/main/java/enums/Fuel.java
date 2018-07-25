package enums;

public enum Fuel {
    Dieesel (1),
    Petrol (2),
    Electro(3);

    private final int type;

    Fuel(int type) {
        this.type = type;
    }
}
