package ru.lanit.first;

public class DarkEnergy extends ObscurePhysicalNature {

    public boolean equals(Object o) {
        if(o instanceof DarkEnergy){
            return super.equals(o);
        }
        return false;
    }

    @Override
    public void printClass() {
        System.out.println("Dark Energy");
    }

    @Override
    public void printAncestor() {
        System.out.println("Obscure Physical Nature");
        super.printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println("No");
    }

    public static DarkEnergy getInstanceOf(){
        DarkEnergy d = new DarkEnergy();
        return d;
    }
}
