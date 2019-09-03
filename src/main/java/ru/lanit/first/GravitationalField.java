package ru.lanit.first;

public class GravitationalField extends Field {

    private GravitationalField(){}

    @Override
    public void printClass() {
        System.out.println("Gravitational Field");
    }

    @Override
    public void printAncestor() {
        System.out.println("Field");
        super.printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println("No");
    }

    public static GravitationalField getInstanceOf(){
        GravitationalField g = new GravitationalField();
        return g;
    }

    public void setOrdinal() {
        ordinal = 4;
    }
}
