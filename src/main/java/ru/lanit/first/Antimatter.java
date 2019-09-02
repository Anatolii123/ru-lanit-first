package ru.lanit.first;

public class Antimatter extends Substance {

    private Antimatter(){}

    @Override
    public String getClassName() {
        return "Antimatter";
    }

    @Override
    public void printAncestor() {
        System.out.println("Substance");
        super.printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println("No");
    }

    public static Antimatter getInstanceOf(){
        Antimatter a = new Antimatter();
        return a;
    }

    public Double annihilate(Substance matter){
        Double energy = Math.pow(this.mass, 2);
        this.mass = 0;
        matter.mass = 0;

        return energy;
    }

    @Override
    public void setOrdinal() {
        ordinal = 5;
    }
}
