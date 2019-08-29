package ru.lanit.first;

public class Substance extends Matter {
    protected int mass;
    protected String state;

    @Override
    public void printClass() {
        System.out.println("Substance");
    }

    @Override
    public void printAncestor() {
        System.out.println("Matter");
        super.printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println(Descendants.values());
    }

    public static int Add(int a, int b) {
        int c = a + b;
        return c;
    }

    enum Descendants{
        HadronSubstance,
        Antimatter,
        NeutronMatter,
        QuarkGluonPlasma
    }

}
