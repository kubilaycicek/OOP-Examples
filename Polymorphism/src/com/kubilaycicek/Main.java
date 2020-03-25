package com.kubilaycicek;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Cat("Hera");
        System.out.println(animal1.talk());

        Animal animal2 = new Dog("Thomas");
        System.out.println(animal2.talk());

        Animal animal3 = new Bird("Hercules");
        System.out.println(animal3.talk());

        System.out.println("------------------");
        
        talk(new Cat("Garfield"));
        talk(new Dog("Jhonas"));
        talk(new Bird("Lady"));

    }

    private static void talk(Animal animal) {
        System.out.println(animal.talk());
    }
}
