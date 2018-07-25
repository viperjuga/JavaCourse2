package enums;

public enum FuelType {
    Diesel (1),
    Petrol (2),
    Electro(3),
    Hybrid(4);

    private final int type;

    FuelType(int type) {
        this.type = type;
    }
}
