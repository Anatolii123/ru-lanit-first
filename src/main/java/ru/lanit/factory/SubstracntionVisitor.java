package ru.lanit.factory;

public class SubstracntionVisitor implements Visitor {

    private MyLong myLong = new MyLong(10L);
    private MyDouble myDouble = new MyDouble(10.0);
    private Matrix operand;

    private MatrixOperation sub = new MatrixSubstractor();

    public SubstracntionVisitor(Matrix operand) {
        this.operand = operand;
    }

    public void visit(Matrix firstOperand) {
        sub.perform(firstOperand, operand);
    }

    public MyLong visit(MyLong operand) {
        myLong.sub(operand);
        return operand;
    }

    public void visit(MyDouble operand) {
        myDouble.sub(operand);
    }
}
