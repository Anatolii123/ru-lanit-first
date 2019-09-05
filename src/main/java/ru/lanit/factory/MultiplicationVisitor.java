package ru.lanit.factory;

public class MultiplicationVisitor implements Visitor {

    private MyLong myLong = new MyLong(10L);
    private MyDouble myDouble = new MyDouble(10.0);
    private Matrix operand;

    private MatrixOperation mult = new MatrixMultiplicator();

    public MultiplicationVisitor(Matrix operand) {
        this.operand = operand;
    }

    public void visit(Matrix firstOperand) {
        mult.perform(firstOperand, operand);
    }

    public MyLong visit(MyLong operand) {
        myLong.mult(operand);
        return operand;
    }

    public void visit(MyDouble operand) {
        myDouble.mult(operand);
    }
}
