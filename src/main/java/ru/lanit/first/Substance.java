package ru.lanit.first;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Substance extends Matter implements Physics,Informatics {
    protected Integer mass;
    protected String state;
    private Long halfLive; // todo реализовать внутренний класс, позволяющий работать с этим (get и set). Завести в Substance метод, возвращающий экземпляр внутреннего класса

    protected Substance(){}

    @Override
    public String getClassName() {
        return "Substance";
    }

    @Override
    public int hashCode() {
        int[] h = {super.hashCode(), mass, state.hashCode()};
        return Arrays.hashCode(h);
    }

    @Override
    public boolean equals(Object o) {
        //TODO нагляднее разбить на несколько строк. Часть вынести в if
        Substance that = (Substance) o;

        if(!(o instanceof Substance)){
            return false;
        }
        if(!(that.state.equals(this.state))){
            return false;
        }
        if (that.mass.equals(this.mass)) {
            return super.equals(o);
        }
        return false;
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
