package ru.lanit.first;

public class NeutronMatter extends Substance {

    private NeutronMatter(){}

    public boolean equals(Object o) {
        if(o instanceof NeutronMatter){
            return super.equals(o);
        }
        return false;
    }

    @Override
    public String getClassName() {
        return "Neutron Matter";
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

    public static NeutronMatter getInstanceOf(){
        NeutronMatter n = new NeutronMatter();
        return n;
    }
}
