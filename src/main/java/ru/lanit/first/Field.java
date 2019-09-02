package ru.lanit.first;

import java.util.Scanner;

public class Field extends Matter{
    protected int intensity;

    protected Field(){}

    @Override
    public void printClass() {
        System.out.println("Field");
    }

    @Override
    public void printAncestor() {
        System.out.println("Matter");
        printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println("ElectromagneticField, GravitationalField");
    }

    public static Field getInstanceOf(){
        Field f = new Field();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите напряженность поля: ");
        f.intensity = in.nextInt();
        return f;
    }

}
