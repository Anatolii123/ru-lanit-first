package ru.lanit.factory;

import ru.lanit.exceptions.AdditionException;
import ru.lanit.exceptions.IncorrectColumnsCountException;
import ru.lanit.exceptions.IncorrectRowsCountException;
import ru.lanit.exceptions.SidesDifferenceException;

public abstract class ParamMatrix<T extends Number>  {
    private int a;
    private int b;
    private MyNumeric<T>[][] content;

    public ParamMatrix(){}

    public ParamMatrix(int a, int b) throws IncorrectRowsCountException, IncorrectColumnsCountException {
        this.a = a;
        this.b = b;
        createContent(a,b);
    }

    /**
     * Метод формирует двумерный массив content заполняя его данными нужного типа
     */
    public abstract MyNumeric<T>[][] createContent(int a, int b) throws IncorrectRowsCountException, IncorrectColumnsCountException;

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
    public ParamMatrix<T> add(ParamMatrix<T> operand) throws AdditionException {
        if(this.getA() != operand.getA() || this.getB() != operand.getB()) {
            throw new AdditionException("Матрицы разных размерностей: размерность 1 матрицы - " + this.getA() + "x" + this.getB()
                    + ", размерность 2 матрицы - " + operand.getA() + "x" + operand.getB() + ".");
        }
        System.out.println("Сумма матриц");
        for (int i = 0; i < operand.getA(); i++) {
            for(int j = 0; j < operand.getB(); j++){
                this.getContent()[i][j].setValue(this.getContent()[i][j].add(operand.getContent()[i][j]));
                System.out.print(this.getContent()[i][j].value + "\t");
            }
            System.out.println();
        }
        return this;
    }
}
