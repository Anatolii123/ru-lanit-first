package ru.lanit.factory;


public class MyDouble implements Operations {
    private Double value;

    public MyDouble(Double value) {
        this.value = value;
    }

    public Operations add(Operations operations) {
        if(!(operations instanceof MyDouble)){
            throw new ArithmeticException("Operation is not defined");
        }
        MyDouble that = (MyDouble) operations;

        return new MyDouble(this.value + that.value);
    }

    public Operations sub(Operations operations) {
        return null;
    }

    public Operations mult(Operations operations) {
        return null;
    }
}
