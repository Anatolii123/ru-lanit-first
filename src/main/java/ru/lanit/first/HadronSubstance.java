package ru.lanit.first;

import java.util.Arrays;

public class HadronSubstance extends Substance {

    protected HadronSubstance(){}

    @Override
    public void printClass() {
        System.out.println("Hadron substance");
    }

    @Override
    public void printAncestor() {
        System.out.println("Substance");
        super.printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println("Baryonic Matter");
    }

    public static HadronSubstance getInstanceOf(){
        HadronSubstance h = new HadronSubstance();
        return h;
    }
}
