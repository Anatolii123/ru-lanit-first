package ru.lanit.factory;

public interface UnaryOperationVisitor {
    //транспонировать
    Operations[][] visit(Matrix operand);
}
