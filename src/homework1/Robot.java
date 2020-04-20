package ru.geekbrains.java2.homework1;

public class Robot implements Participant {

    private final String model;
    private final int powerJump;
    private final int powerRun;

    public Robot(String model, int powerJump, int powerRun) {
        this.model = model;
        this.powerJump = powerJump;
        this.powerRun = powerRun;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "model='" + model + '\'' +
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
