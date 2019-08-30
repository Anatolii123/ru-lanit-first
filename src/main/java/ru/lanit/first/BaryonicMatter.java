package ru.lanit.first;

public class BaryonicMatter extends HadronSubstance {

    protected BaryonicMatter(){}

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
        public void printClass() {
            System.out.println("Baryonic Matter");
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
