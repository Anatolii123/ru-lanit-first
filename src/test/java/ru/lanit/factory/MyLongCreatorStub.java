package ru.lanit.factory;

public class MyLongCreatorStub extends MyLongCreator {
    private Operations[][] content;

    public void setContent(Operations[][] content) {
        this.content = content;
    }

    @Override
    protected Operations[][] create(int a, int b) {
        return content;
    }
}
