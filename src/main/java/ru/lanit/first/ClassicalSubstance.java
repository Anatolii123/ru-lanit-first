package ru.lanit.first;

import java.util.Arrays;

public class ClassicalSubstance extends BaryonicMatter {

    private ClassicalSubstance(){}

    @Override
    public void setOrdinal() {
        ordinal = 17;
    }

    @Override
    public String getClassName() {
        return "Classical Substance";
    }

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
    public void printAncestor() {
        System.out.println("Baryonic Matter");
        super.printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println("No");
    }

    public static ClassicalSubstance getInstanceOf(){
        ClassicalSubstance c = new ClassicalSubstance();
        return c;
    }
}
