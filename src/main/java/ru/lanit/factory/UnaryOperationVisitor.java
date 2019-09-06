package ru.lanit.factory;

public interface UnaryOperationVisitor {
    //транспонировать
    void visit(Matrix operand);
    void visit (ParamMatrix firstOperand);
}
