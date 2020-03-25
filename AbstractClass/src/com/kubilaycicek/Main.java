package com.kubilaycicek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shape shape1 = new Circle("Circle 1", 10);
        shape1.calculateArea();

        Shape shape2 = new Square("Square 1", 10);
        shape2.calculateArea();

        Shape shape3 = new Triangle("Triangle 1", 3, 4, 5);
        shape3.calculateArea();
    }
}
