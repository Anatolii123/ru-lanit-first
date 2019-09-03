package ru.lanit.first;

public class DarkMatter extends ObscurePhysicalNature {

    public boolean equals(Object o) {
        if(o instanceof DarkMatter){
            return super.equals(o);
        }
        return false;
    }

    @Override
    public void printClass() {
        System.out.println("Dark Matter");
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

    public static DarkMatter getInstanceOf(){
        DarkMatter d = new DarkMatter();
        return d;
    }

}
