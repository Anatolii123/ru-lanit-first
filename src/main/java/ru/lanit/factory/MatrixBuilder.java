package ru.lanit.factory;

public class MatrixBuilder {
    private ContentCreator creator;
    private Integer a;
    private Integer b;

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

    //TODO перенести установку разщмерностей на уровень директора
    public Matrix toMatrix(){
        Matrix result = new Matrix();

        //TODO проверочный код тоже пренести в директор (метод make), в котором, кроме проверочного кода будет setA, setB и toMatrix
        if (creator == null) {
            throw new NullPointerException("");
        }

        result.setCreator(creator);
        result.setMatrix(creator.create(a, b));
        return result;
    }
}
