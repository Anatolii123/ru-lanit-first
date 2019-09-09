package ru.lanit.factory;

import java.util.Scanner;

public class MatrixBuilder {
    private ContentCreator creator;
    private Integer a;
    private Integer b;

    public MatrixBuilder(){}
    public MatrixBuilder(ContentCreator creator) { // todo настраиваем класс-билдер при создании
        this.creator = creator;
    }
    public MatrixBuilder setA(Integer a) {
        this.a = a;
        return this;
    }
    public MatrixBuilder setB(Integer b) {
        this.b = b;
        return this;
    }

    public Matrix toMatrix(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите тип(Long/Double):");
        String str = new String(in.nextLine());
        ParamMatrix result2 = new ParamMatrix(str);
        Matrix result = new Matrix();
        if (creator == null) {
            throw new NullPointerException("");
        }
        result.setMatrix(creator.create(a, b));
        return result;
    }

    public ParamMatrix toParamMatrix(){

    }
}
