package ru.lanit.factory;

public class SummationVisitor implements Visitor {
    //TODO сделать тоже самое для умножения
    private MyLong myLong = new MyLong(10L);
    private MyDouble myDouble = new MyDouble(10.0);
    private Matrix operand;

    private MatrixOperation sum = new MatrixSummator();

    public SummationVisitor(Matrix operand) {
        this.operand = operand;
    }

    public void visit(Matrix firstOperand) {
        sum.perform(firstOperand, operand);
    }

    public void visit(MyLong operand) {
        myLong.add(operand);
    }

    public void visit(MyDouble operand) {
        myDouble.add(operand);
    }
}
