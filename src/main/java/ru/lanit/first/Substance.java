package ru.lanit.first;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Substance extends Matter implements Physics,Informatics {
    protected int mass;
    protected String state;
    private Long halfLive; // todo реализовать внутренний класс, позволяющий работать с этим (get и set). Завести в Substance метод, возвращающий экземпляр внутреннего класса

    protected Substance(){}

    @Override
    public void setScience() {
        science = "chemistry";
    }

    @Override
    public void setMathDescription() {
        mathDescription = true;
    }

    @Override
    public void setOrdinal() {
        ordinal = 0;
    }

    @Override
    public String getClassName() {
        return "Substance";
    }

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


    public void force() {
        System.out.println("It has.");
    }

    public void amountOfInformation() {
        System.out.println("A lot of!");
    }



    public Set<Philosophy> calculate(Philosophy substance) {
        Set<Philosophy> substancess = new HashSet<Philosophy>();
        for (int i=0;i<5;i++){
            substancess.add(new Substance());
        }
        while (!substancess.isEmpty()){
            System.out.println(substancess);
        }
        return substancess;
    }

    @Override
    public void printAncestor() {
        System.out.println("Matter");
    }

    @Override
    public void printDescendants() {
        System.out.println(SubstanceDescendants.values());
    }

    public static Substance getInstanceOf(){
        Substance s = new Substance();
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите массу вещества: ");
//        s.mass = in.nextInt();
//        System.out.println("Введите агрегатное состояние вещества: ");
//        s.state = in.next();
        return s;
    }

    public static HalfLife getInstanceOfInner(){
        Substance s = new Substance();
        HalfLife h = s.new HalfLife();
        return h;
    }

    public HalfLife convertToInstanceHalfLive(){
        return new HalfLife();
    }

    public class HalfLife {

        public Long getHalfLife() {
            return halfLive;
        }

        public void setHalfLife(Long halfLive) {
            Substance.this.halfLive = halfLive;
        }

    }

}
