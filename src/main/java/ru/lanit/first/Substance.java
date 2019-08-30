package ru.lanit.first;

import java.util.Scanner;

public class Substance extends Matter {
    protected int mass;
    protected String state;

    private Long halfLive; // todo реализовать внутренний класс, позволяющий работать с этим (get и set). Завести в Substance метод, возвращающий экземпляр внутреннего класса

    protected Substance(){}

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
        System.out.println(SubstanceDescendants.values());
    }

    public static Substance getInstanceOf(){
        Substance s = new Substance();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите массу вещества: ");
        s.mass = in.nextInt();
        System.out.println("Введите агрегатное состояние вещества: ");
        s.state = in.next();
        return s;
    }

    public class halfLife {
        public Long getH() {
            return halfLive;
        }
        public void setH(Long halfLive) {
            Substance.this.halfLive = halfLive;
        }
    }

    public static Substance.halfLife getInstanceOfInner(){
        Substance s = new Substance();
        Substance.halfLife h = s.new halfLife();
        return h;
    }

}
