package ru.lanit.factory;

public interface UnaryOperationVisitor {
    //транспонировать
    Matrix visit(Matrix operand);
}
