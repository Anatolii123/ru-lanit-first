package ru.lanit.factory;

public interface Visitor {
    void visit(MyDouble);
    void visit(MyLong);
}
