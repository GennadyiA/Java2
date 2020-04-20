package ru.geekbrains.java2.homework1;

import java.util.LinkedList;
import java.util.List;

public class Competition {
    private String name;
    private Obstacle[] obstacles;
    private Participant [] participants;
    private final List<Participant> lastWinners = new LinkedList<>();

    public Competition(String name) {
        this.name = name;
    }

    public void setObstacles(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void setParticipants(Participant... participants) {
        this.participants = participants;
    }

    public void startCompetition() {
        lastWinners.clear();

        for(Participant participant : participants) {
            boolean success = passAllObstacles(participant);
            if (!success) {
                System.out.println("Участник " + participant + " покинул испытание.");
            } else {
                lastWinners.add(participant);
            }
        }
    }

    public List<Participant> getLastWinners() {
        return lastWinners;
    }

    private boolean passAllObstacles(Participant participant){
        for (Obstacle obstacle : obstacles) {
            if(!obstacle.checkObstacle(participant)){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Competition{" +
                "name='" + name + '\'' +
                '}';
    }

}
