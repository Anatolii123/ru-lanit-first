package ru.lanit.factory;

public class MatrixBuilder {
    private ContentCreator creator;
    private Integer a;
    private Integer b;

    public MatrixBuilder setCreator(ContentCreator creator) {
        this.creator = creator;
        return this;
    }

    public MatrixBuilder setA(int a) {
        this.a = a;
        return this;

    }

    public MatrixBuilder setB(int b) {
        this.b = b;
        return this;
    }

    public Matrix toMatrix(){
        //todo добавить проверки на возможность создания
        Matrix result = new Matrix();
        result.setA(a);
        result.setB(b);
        result.setCreator(creator);
        result.setMatrix(creator.create(a, b));

        return result;
    }
}
