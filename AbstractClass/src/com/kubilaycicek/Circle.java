package com.kubilaycicek;

public class Circle extends Shape {

    private int r;

    public Circle(String name, int r) {
        super(name);
        this.r = r;
    }

    @Override
    void calculateArea() {
        System.out.println(getName() + " area : " + (Math.PI * r * r));
    }
}
