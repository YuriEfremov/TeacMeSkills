package by.teachmeskills.lection12.Demo.inClass;

public enum Type {
    BestSeller(10),
    Regular(0),
    Special(5);
    private int value;

    Type(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }
}
