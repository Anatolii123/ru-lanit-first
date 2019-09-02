package ru.lanit.first;

import java.util.Stack;
import java.util.Scanner;

public class Substance extends Matter implements Physics,Informatics {
    protected int mass;
    protected String state;

    private Long halfLive; // todo реализовать внутренний класс, позволяющий работать с этим (get и set). Завести в Substance метод, возвращающий экземпляр внутреннего класса

    protected Substance(){}

    public void mathDescription() {
        System.out.println("It has.");
    }

    public void force() {
        System.out.println("It has.");
    }

    public void reason() {
        System.out.println("Big explosion.");
    }

    public void amountOfInformation() {
        System.out.println("A lot of!");
    }

    public void calculate() {
        Stack<Substance> substancess = new Stack<Substance>();
        for (int i=0;i<5;i++){
            substancess.push(new Substance());
        }
        while (!substancess.empty()){
            substancess.pop().printClass();
        }
    }

    @Override
    public void printClass() {
        System.out.println("Substance");
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
