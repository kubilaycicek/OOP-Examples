package com.kubilaycicek;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return this.getName() + " cik cik cik ....";
    }
}
