package ru.lanit.factory;

public abstract class ParamMatrix<T extends Number>  {
    private int a;
    private int b;
    private MyNumeric<T>[][] content;

    public ParamMatrix(){}

    public ParamMatrix(int a, int b) {
        this.a = a;
        this.b = b;
        createContent(a,b);
    }

    /**
     * Метод формирует двумерный массив content заполняя его данными нужного типа
     */
    public abstract MyNumeric<T>[][] createContent(int a, int b);

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public MyNumeric<T>[][] getContent() {
        return content;
    }

    public void setContent(MyNumeric<T>[][] content) {
        this.content = content;
    }

    /**
     * Метод прибавляет к матрице переданную в operand
     *
     * @param operand матрица, которую нужно пибавить
     * @return матрица, представляющая собой сумму
     */
    public abstract ParamMatrix<T> add(ParamMatrix<T> operand);



}
