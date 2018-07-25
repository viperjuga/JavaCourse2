package enums;

public enum Fuel {
    Diesel (1),
    Petrol (2),
    Electro(3),
    Hybrid(4);

    private final int type;

    Fuel(int type) {
        this.type = type;
    }
}
