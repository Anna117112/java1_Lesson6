package com.geekbrains;

public class main {

    public static void main(String[] args) {


        Animal tiger = new Animal("Лютик");


        Cat cat = new Cat("Мурзик");
        Dog dog = new Dog("Бобик");

        dog.run(15);
        dog.swim(10);

        cat.run(210);
        cat.swim(10);
        Animal.getCount();
        Cat.getCount();
        Dog.getCount();
    }
}
