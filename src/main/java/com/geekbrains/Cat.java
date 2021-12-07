package com.geekbrains;

public class  Cat extends Animal {
    private static int countCat;
    public Cat(String name) {
        super(name);
        countCat++;
    }
    public static int getCount() {
        System.out.println("Создано " + countCat + " кот");
        return countCat;
    }
    @Override
    public void run(int lengthObstacle){
        if (lengthObstacle<=200) {
            super.run(lengthObstacle);
        }
        else
            System.out.println("Ограничение на бег кота - 200м");

    }

    @Override
    public void swim (int lengthObstacle){
        System.out.println("Кот не умеет плавить");
    }





}
