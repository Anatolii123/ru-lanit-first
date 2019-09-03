package ru.lanit.first;

import java.util.Arrays;

public class HadronSubstance extends Substance {

    protected HadronSubstance(){}

    @Override
    public int hashCode() {
        int[] h = {ordinal, science.length(),mass};
        return Arrays.hashCode(h)+this.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        boolean a = this.hashCode() == o.hashCode() && this.getClass() == o.getClass()
                && ((Matter) o).mathDescription == this.mathDescription && ((Matter) o).science == this.science
                && ((Matter) o).ordinal == ordinal;
        return a;
    }

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
