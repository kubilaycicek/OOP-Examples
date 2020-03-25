package com.kubilaycicek;

public class HumanManager implements IHuman {
    @Override
    public String eat(Human human) {
        return human.getName() + " eating...";
    }

    @Override
    public String run(Human human) {
        return human.getName() + " runnig...";
    }

    @Override
    public String sleep(Human human) {
        return human.getName() + " sleeping..";
    }
}
