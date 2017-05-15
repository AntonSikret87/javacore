package com.karabeinikovAntonSikret87.app.homework.lesson15.Task1;

/**
 * Created by AntonKa on 5/8/2017.
 */
public class FootballClub extends SportClub {

    public FootballClub(String clubName, String clubLocation) {
        super(clubName, clubLocation);
    }


    @Override
    protected void showName(String clubName) {
        System.out.println("Footbal club name is: " + getClubName());
    }

    @Override
    protected void showLocation(String clubLocation) {
        System.out.println("Footbal club location is: " + getClubLocation());
    }

    @Override
    protected void showStatistic(int wins, int draws, int defeats, int numberOfPoints, int numberOfMatchesPlayed) { //
        System.out.println("Wins: " + getWins());
        System.out.println("Draws: " + getDraws());
        System.out.println("Defeats: " + getDefeats());
        System.out.println("Number of points: " + getNumberOfPoints());
        System.out.println("Number of matches played: " +getNumberOfMatchesPlayed());

    }
}
