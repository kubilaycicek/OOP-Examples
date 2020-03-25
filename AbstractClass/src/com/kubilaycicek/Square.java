package com.kubilaycicek;

public class Square extends Shape {

    private int a;

    public Square(String name, int a) {
        super(name);
        this.a = a;
    }

    @Override
    void calculateArea() {
        System.out.println(getName() + " area : " + (a * a));
    }
}
