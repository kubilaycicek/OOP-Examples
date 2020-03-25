package com.kubilaycicek;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return getName() + " hav hav hav.....";
    }
}
