package ru.lanit.first;

public class ClassicalSubstance extends BaryonicMatter {
    @Override
    public void printClass() {
        System.out.println("Classical Substance");
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
}
