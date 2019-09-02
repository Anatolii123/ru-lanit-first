package ru.lanit.first;

import java.util.Scanner;

public class Field extends Matter{
    protected int intensity;

    public void mathDescription() {
        System.out.println("It has.");
    }

    public void force() {
        System.out.println("It has.");
    }

    public void reason() {
        System.out.println("Unknown.");
    }

    public void amountOfInformation() {
        System.out.println("A lot of!");
    }

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
