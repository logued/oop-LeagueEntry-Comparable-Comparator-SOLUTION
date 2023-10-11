package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("League of LeagueEntries");

        League league1 = new League();

        // create LeagueEntry objects and add each one to the League container object
        // (the League container stores the teams internally in an ArrayList)
        league1.addEntry( new LeagueEntry("Newcastle",3,0,0,0,30));
        league1.addEntry( new LeagueEntry("WestHam",1,0,0,0,20));
        league1.addEntry( new LeagueEntry("Arsenal",2,0,0,0,20));

        league1.display();
        league1.sort();  // by natural ordering
        league1.display();

        league1.sortByGamesPlayedAscending();
        league1.display();


    }
}