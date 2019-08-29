package ru.lanit.first;

public class Antimatter extends Substance {
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
}
