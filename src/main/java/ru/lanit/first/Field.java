package ru.lanit.first;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Field extends Matter implements Physics, Informatics{
    protected Integer intensity;

    protected Field(){}

    @Override
    public String getClassName() {
        return "Field";
    }

    @Override
    public int hashCode() {
        int[] h = {super.hashCode(),intensity};
        return Arrays.hashCode(h);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && o instanceof Field && ((Field) o).intensity.equals(this.intensity);
    }

    public void force() {
        System.out.println("It has.");
    }

    public void amountOfInformation() {
        System.out.println("A lot of!");
    }

    @Override
    public Set<Philosophy> calculate(Philosophy field) {
        Set<Philosophy> fields = new HashSet<Philosophy>();
        for (int i = 0; i < 5; i++) {
            fields.add(new Field());
        }
        return fields;
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
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите напряженность поля: ");
//        f.intensity = in.nextInt();
        return f;
    }

}
