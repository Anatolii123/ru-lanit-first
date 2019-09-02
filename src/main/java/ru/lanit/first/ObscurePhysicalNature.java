package ru.lanit.first;

import java.util.ArrayList;
import java.util.List;

public class ObscurePhysicalNature extends Matter {

    protected ObscurePhysicalNature(){}


    public String reason() {
        System.out.println("Unknown.");
    }

    public void calculate() {
        List<ObscurePhysicalNature> fields = new ArrayList<ObscurePhysicalNature>(4);
        for (ObscurePhysicalNature s:fields) {
            s.printClass();
        }
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
