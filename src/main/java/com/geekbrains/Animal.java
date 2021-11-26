package com.geekbrains;

public class Animal {
    protected String name;
    protected int lengthObstacle;
    private static int count=0;

    public Animal(){
        count++;
    }
    public static int getCount() {
        System.out.println("Создано " + count+" животных");
        return count;
    }

    public Animal(String name) {
        this.name = name;
        count ++;
        
    }
    public void run(int lengthObstacle){
        System.out.println(name + " пробежал " +lengthObstacle +"м");
    }
    public void swim (int lengthObstacle){
        System.out.println(name + " проплыл " + lengthObstacle + "м");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLengthObstacle() {
        return lengthObstacle;
    }

    public void setLengthObstacle(int lengthObstacle) {
        this.lengthObstacle = lengthObstacle;
    }
}

