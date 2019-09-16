package ru.lanit.factory;

public class MyDoubleCreatorStub extends MyDoubleCreator {
    private Operations[][] content;

    public void setContent(Operations[][] content) {
        this.content = content;
    }

    @Override
    protected Operations[][] create(int a, int b) {
        return content;
    }
}
