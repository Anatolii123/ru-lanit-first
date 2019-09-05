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
        return new MyLong(this.value + that.value);
    }

    public Operations sub(Operations operations) {
        if(!(operations instanceof MyLong)){
            throw new ArithmeticException("Operation is not possible");
        }
        MyLong that = (MyLong) operations;
        return new MyLong(this.value - that.value);
    }

    public Operations mult(Operations operations) {
        if(!(operations instanceof MyLong)){
            throw new ArithmeticException("Operation is not possible");
        }
        MyLong that = (MyLong) operations;
        return new MyLong(this.value * that.value);
    }

    public MyLong accept(Visitor visitor) {
        return visitor.visitMyLong(this);
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
