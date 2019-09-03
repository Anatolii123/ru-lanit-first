package ru.lanit.first;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ObscurePhysicalNature extends Matter {
    protected int energy;

    protected ObscurePhysicalNature(){}

    @Override
    public String getClassName() {
        return "Obscure Physical Nature";
    }

    @Override
    public int hashCode() {
        int[] h = {super.hashCode(), energy};
        return Arrays.hashCode(h);
    }

    @Override
    public boolean equals(Object o) {
        boolean a = this.hashCode() == o.hashCode() && this.getClass() == o.getClass()
                && ((Matter) o).mathDescription == this.mathDescription && ((Matter) o).science == this.science
                && ((Matter) o).ordinal == ordinal;
        return a;
    }

    @Override
    public Set<Philosophy> calculate(Philosophy obscure) {
        Set<Philosophy> obscures = new HashSet<Philosophy>();
        for (int i = 0; i < 5; i++) {
            obscures.add(new Field());
        }
        return obscures;
    }

    @Override
    public void printAncestor() {
        System.out.println("Matter");
    }

    @Override
    public void printDescendants() {
        System.out.println("DarkMatter, DarkEnergy");
    }

    public static ObscurePhysicalNature getInstanceOf(){
        ObscurePhysicalNature o = new ObscurePhysicalNature();
        return o;
    }
}
