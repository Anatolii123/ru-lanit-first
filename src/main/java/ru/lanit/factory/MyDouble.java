package ru.lanit.factory;

public class MyDouble implements Operations {
    private Double value;

    public MyDouble(Double value) {
        this.value = value;
    }

    public Operations add(Operations operations) {
        if(!(operations instanceof MyDouble)){
            throw new ArithmeticException("Operation is not possible");
        }
        MyDouble that = (MyDouble) operations;
        MyDouble result = new MyDouble(this.value + that.value);
        return result;
    }

    public Operations sub(Operations operations) {
        if(!(operations instanceof MyDouble)){
            throw new ArithmeticException("Operation is not possible");
        }
        MyDouble that = (MyDouble) operations;
        MyDouble result = new MyDouble(this.value - that.value);
        return result;
    }

    public Operations mult(Operations operations) {
        if(!(operations instanceof MyDouble)){
            throw new ArithmeticException("Operation is not possible");
        }
        MyDouble that = (MyDouble) operations;
        MyDouble result = new MyDouble(this.value * that.value);
        return result;
    }

    public Operations accept(Visitor visitor) {
        return this;
    }


    @Override
    public String toString() {
        return this.value.toString();
    }
}
