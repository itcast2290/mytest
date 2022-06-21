package com.it;

public class D extends C{
    private String content;

    public D(String content) {
        this.content = content;
    }

    public D() {
    }

    @Override
    public String toString() {
        return "D{" +
                "content='" + content + '\'' +
                '}';
    }
}
