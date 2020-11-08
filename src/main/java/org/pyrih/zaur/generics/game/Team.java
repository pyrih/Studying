package org.pyrih.zaur.generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addParticipant(T participant) {
        participants.add(participant);
        System.out.println("At the team was added: " + participant.getName());
    }

    public void playWith(Team<T> team) {
        String winner;
        Random random = new Random();
        int i = random.nextInt(2);

        if (i == 0) {
            winner = this.name;
        } else {
            winner = team.name;
        }
        System.out.println("The team: " + winner + " has won");
    }
}
