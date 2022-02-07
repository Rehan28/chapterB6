package com.rehan.c6;

public class CricketPlayerDemo {
    public static void main(String[] args) {
        CricketPlayer Rehan = new CricketPlayer("Rehan");
        Rehan.addScore(1);
        Rehan.addScore(5);
        Rehan.addScore(6);
        Rehan.addScore(2);

        CricketPlayer Remon = new CricketPlayer("Remon");
        Remon.addScore(4);
        Remon.addScore(3);
        Remon.addScore(6);
        Remon.addScore(4);

        CricketPlayer Akas = new CricketPlayer("Akas");
        Akas.addScore(4);
        Akas.addScore(6);
        Akas.addScore(1);
        Akas.addScore(2);

        System.out.println("Rehan = "+Rehan.getScore());
        System.out.println("Remon = "+Remon.getScore());
        System.out.println("Akas = "+Akas.getScore());

        System.out.println("Total Score = "+CricketPlayer.getTotalScore());

    }
}
