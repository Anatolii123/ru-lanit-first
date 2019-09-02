package ru.lanit.first;

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
