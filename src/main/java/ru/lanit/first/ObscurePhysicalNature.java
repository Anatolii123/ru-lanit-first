package ru.lanit.first;

import java.util.HashSet;
import java.util.Set;

public class ObscurePhysicalNature extends Matter {

    protected ObscurePhysicalNature(){}

    @Override
    public void setOrdinal() {
        System.out.println("Hello");
    }

    @Override
    public String getClassName() {
        String s = new String();
        return s;
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
    public void printClass() {
        System.out.println("Obscure Physical Nature");
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
