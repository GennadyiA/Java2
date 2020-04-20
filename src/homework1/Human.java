package ru.geekbrains.java2.homework1;

public class Human implements Participant {

    private final String name;
    private final int powerJump;
    private final int powerRun;

    public Human(String name, int powerJump, int powerRun) {
        this.name = name;
        this.powerJump = powerJump;
        this.powerRun = powerRun;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", powerJump=" + powerJump +
                ", powerRun=" + powerRun +
                '}';
    }

    @Override
    public int run() {
        return powerRun;
    }

    @Override
    public int jump() {
        return powerJump;
    }

}