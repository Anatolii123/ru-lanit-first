package ru.lanit.factory;

public interface Visitor {
    void visit(MyDouble myDouble);
    void visit(MyLong myLong);
}
