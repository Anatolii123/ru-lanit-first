package ru.lanit.factory;

public class MyLong implements Operations {
    private Long value;

    public MyLong(Long value) {
        this.value = value;
    }

    public Operations add(Operations operations) {
        if(!(operations instanceof MyLong)){
            throw new ArithmeticException("Operation is not defined");
        }
        MyLong that = (MyLong) operations;
        MyLong result = new MyLong(this.value + that.value);
        return result;
    }

    public Operations sub(Operations operations) {
        if(!(operations instanceof MyLong)){
            throw new ArithmeticException("Operation is not possible");
        }
        MyLong that = (MyLong) operations;
        MyLong result = new MyLong(this.value - that.value);
        return result;
    }

    public Operations mult(Operations operations) {
        if(!(operations instanceof MyLong)){
            throw new ArithmeticException("Operation is not possible");
        }
        MyLong that = (MyLong) operations;
        MyLong result = new MyLong(this.value * that.value);
        return result;
    }

    public MyLong accept(Visitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
