package ru.lanit.first;

public enum Description {
    Science("physics"),
    MathDescription(true),
    Mass(10),
    State("solid"),
    Intensity(100);

    private String description;
    private boolean boolDescription;
    private int numDescription;

    Description(String description) {
        this.description = description;
    }
    Description(boolean boolDescription) {
        this.boolDescription = boolDescription;
    }
    Description(int numDescription) {
        this.numDescription = numDescription;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
