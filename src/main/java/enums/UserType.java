package enums;

public enum UserType {
    Client (1),
    Operator (2);

    private final int type;

    UserType(int type) {
        this.type = type;
    }

    public int getValue() {
        return type;
    }
}
