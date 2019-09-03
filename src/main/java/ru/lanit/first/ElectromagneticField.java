package ru.lanit.first;

public class ElectromagneticField extends Field {

    protected ElectromagneticField(){}

    public boolean equals(Object o) {
        if(o instanceof ElectromagneticField){
            return super.equals(o);
        }
        return false;
    }

    @Override
    public void printClass() {
        System.out.println("Electromagnetic Field");
    }

    @Override
    public void printAncestor() {
        System.out.println("Field");
        super.printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println("ElectricField, MagneticField");
    }

    public static ElectromagneticField getInstanceOf(){
        ElectromagneticField e = new ElectromagneticField();
        return e;
    }

}
