package com.kubilaycicek;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Kubilay");

        HumanManager hm = new HumanManager();

        System.out.println(hm.eat(human));
        System.out.println(hm.run(human));
        System.out.println(hm.sleep(human));
    }
}
