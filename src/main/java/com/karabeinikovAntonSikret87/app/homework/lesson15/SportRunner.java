package com.karabeinikovAntonSikret87.app.homework.lesson15;

/**
 * Created by AntonKa on 5/8/2017.
 */
public class SportRunner {
    public static void main(String[] args) {
        String footballClubNameManchester = "Manchester";
        String footbalLocation = "England";


        FootballClub footballClub = new FootballClub(footballClubNameManchester, footbalLocation);
        footballClub.showName(footballClubNameManchester);
        footballClub.showLocation(footbalLocation);

        System.out.println("Name renamed to: ");
        footballClub.setClubName("Arsenal");
        footballClub.showName(footballClub.getClubName());

        System.out.println("Change location to: ");
        footballClub.setClubLocation("Madrid");
        footballClub.showLocation(footballClub.getClubLocation());

        footballClub.setWins(5);
        footballClub.setDraws(1);
        footballClub.setDefeats(2);
        footballClub.setNumberOfPoints(10);
        footballClub.setNumberOfMatchesPlayed(8);

        footballClub.showStatistic(footballClub.getWins(), footballClub.getDraws(), footballClub.getDefeats()
        ,footballClub.getNumberOfPoints(), footballClub.getNumberOfMatchesPlayed());
    }
}
