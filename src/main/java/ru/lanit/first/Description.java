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
    Description(){}

    public String getDescription() {
        return description;
    }
    public boolean getBooLDescription() {
        return boolDescription;
    }
    public int getNumDescription() {
        return numDescription;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public static String constant() {
        return Description.Science.toString();
    }
    public static Description getBy(String s){
        for (Description d: Description.values()){
            if(d.getDescription().equals(s)){
                return d;
            }
        }
        return null;
    }

    public static Description getBy(boolean b){
        for (Description d: Description.values()){
            if(d.getBooLDescription() == b && d.getDescription() == null && d.getNumDescription() == 0){
                return d;
            }
        }
        return null;
    }

    public static Description getBy(int i){
        for (Description d: Description.values()){
            if(d.getNumDescription() == i){
                return d;
            }
        }
        return null;
    }


}
