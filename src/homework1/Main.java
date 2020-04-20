package ru.geekbrains.java2.homework1;

public class Main {
    public static void main(String[] args) {
        Competition competition = create();
        System.out.println("Начали соревнование! " + competition);
        competition.startCompetition();
        System.out.println("Закончили соревнование!");
        for(Participant winner : competition.getLastWinners()) {
            System.out.println(winner);
        }
    }

    private static Competition create(){

        Participant human = new Human("Vasya", 100, 4000);
        Participant cat = new Cat("Barsik",300, 3000);
        Participant robot = new Robot("android", 200, 10000);
        Treadmill treadmill = new Treadmill(6000);
        Wall wall = new Wall(150);

        Competition competition = new Competition("игра 1");
        competition.setParticipants(human, cat, robot);
        competition.setObstacles(wall, treadmill);

        return competition;
    }

}
