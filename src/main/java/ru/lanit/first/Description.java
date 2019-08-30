package ru.lanit.first;

public enum Description {
    Science("physics"),
    MathDescription(true),
    Mass(10),
    State("solid"),
    Intensity(100),
    Nothing();

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
    Description(){}

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public static String constant() {
        return Description.Science.toString();
    }
//    public Description getBy(){
//
//    }


}
