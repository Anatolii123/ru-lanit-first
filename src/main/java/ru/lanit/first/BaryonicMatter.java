package ru.lanit.first;

import java.util.Arrays;

public class BaryonicMatter extends HadronSubstance {

    protected BaryonicMatter(){}

    @Override
    public int hashCode() {
        int[] h = {ordinal, science.length(),mass};
        return Arrays.hashCode(h)+this.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        boolean a = this.hashCode() == o.hashCode() && this.getClass() == o.getClass()
                && ((Matter) o).mathDescription == this.mathDescription && ((Matter) o).science == this.science
                && ((Matter) o).ordinal == ordinal;
        return a;
    }

    @Override
    public void printClass() {
        System.out.println("Baryonic Matter");
    }

    @Override
    public void printAncestor() {
        System.out.println("Hadron substance");
        super.printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println("Classical Substance");
    }

    public static BaryonicMatter getInstanceOf(){
        BaryonicMatter b = new BaryonicMatter();
        return b;
    }

    private void printSentence2(){
        System.out.println("This is a BaryonicMatter.");
    }

    public static class BaryonicMatter2 extends Substance {

        @Override
        public String getClassName() {
            return "Baryonic Matter";
        }

        @Override
        public void printAncestor() {
            System.out.println("Substance");
            super.printAncestor();
        }

        @Override
        public void printDescendants() {
            System.out.println("Classical Substance");
        }
    }

    public class BaryonicMatter3 extends QuantumFields { // todo унаследовать, например, от QuantumFields и сделть так, чтобы одновременно использовались методы BaryonicMatter и QuantumFields

        @Override
        public void printClass() {
            System.out.println("Baryonic Matter");
        }

        @Override
        public void printAncestor() {
            System.out.println("Matter");
            super.printAncestor();
        }

        @Override
        public void printDescendants() {
            System.out.println("Classical Substance");
        }

        public void printSentence2() {
            BaryonicMatter.this.printSentence2();
        }
    }

}
