package ru.lanit.first;

public class Antimatter extends Substance {

    private Antimatter(){}

    @Override
    public void printClass() {
        System.out.println("Antimatter");
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
}
