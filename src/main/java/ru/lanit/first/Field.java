package ru.lanit.first;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Field extends Matter implements Physics, Informatics{
    protected int intensity;

    protected Field(){}

    @Override
    public void setScience() {
        science = "physics";
    }

    @Override
    public void setMathDescription() {
        mathDescription = true;
    }

    @Override
    public void setOrdinal() {
        ordinal = 1;
    }

    @Override
    public String getClassName() {
        return "Field";
    }

    @Override
    public int hashCode() {
        int[] h = {ordinal, science.length(),intensity};
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
