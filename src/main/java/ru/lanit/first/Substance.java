package ru.lanit.first;

import java.util.Scanner;

public class Substance extends Matter {
    protected int mass;
    protected String state;

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
        s.state = in.nextLine();
        return s;
    }
}
