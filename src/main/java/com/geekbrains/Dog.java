package com.geekbrains;

public class Dog extends Animal{
    private static int countDog;
    public Dog(String name) {
        super(name);
        countDog++;
    }

    public static int getCount() {
        System.out.println("Создано " + countDog + " собака");
        return countDog;
    }

    @Override
    public void run(int lengthObstacle){
        if (lengthObstacle<=500) {
            super.run(lengthObstacle);
        }
        else
            System.out.println("Ограничение на бег собаки - 500м");

    }

    @Override
    public void swim (int lengthObstacle){
        if (lengthObstacle<=10) {
            super.swim(lengthObstacle);
        }
        else
            System.out.println("Ограничение на плавание собаки - 10м");

    }
}
