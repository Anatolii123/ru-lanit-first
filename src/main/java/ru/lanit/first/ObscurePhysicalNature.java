package ru.lanit.first;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ObscurePhysicalNature extends Matter {
    protected Integer energy;

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
        return super.equals(o) && o instanceof ObscurePhysicalNature && ((ObscurePhysicalNature) o).energy.equals(this.energy);
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
