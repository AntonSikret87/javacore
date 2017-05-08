package com.karabeinikovAntonSikret87.app.homework.lesson15;

/**
 * Created by AntonKa on 5/8/2017.
 */
public abstract class SportClub {

    private String clubName;
    private String clubLocation;
    private int wins;
    private int draws;
    private int defeats;
    private int numberOfPoints;
    private int numberOfMatchesPlayed;

    public SportClub(String clubName, String clubLocation) {
        this.clubName = clubName;
        this.clubLocation = clubLocation;
    }

    protected abstract void showName(String clubName);
    protected abstract void showLocation(String clubLocation);
    protected abstract void showStatistic(int wins, int draws, int defeats, int numberOfPoints, int numberOfMatchesPlayed);

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubLocation() {
        return clubLocation;
    }

    public void setClubLocation(String clubLocation) {
        this.clubLocation = clubLocation;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public int getNumberOfMatchesPlayed() {
        return numberOfMatchesPlayed;
    }

    public void setNumberOfMatchesPlayed(int numberOfMatchesPlayed) {
        this.numberOfMatchesPlayed = numberOfMatchesPlayed;
    }
}
