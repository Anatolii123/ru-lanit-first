package ru.lanit.first;

import java.util.Scanner;

public class ElectricField extends ElectromagneticField {
    protected int intensity;

    private ElectricField(){}

    @Override
    public void printClass() {
        System.out.println("Electric Field");
    }

    @Override
    public void printAncestor() {
        System.out.println("Electromagnetic Field");
        super.printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println("No");
    }

    public static ElectricField getInstanceOf(){
        ElectricField e = new ElectricField();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите напряженность поля: ");
        e.intensity = in.nextInt();
        return e;
    }
}
