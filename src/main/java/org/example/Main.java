package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("League of LeagueEntries");

        League league1 = new League();

        // create LeagueEntry objects (teams), and add each one to the League container object
        // (the League container stores the teams internally in an ArrayList)
        // Note that we can not access the ArrayList from main, as it is private within the League object.
        //
        league1.addEntry( new LeagueEntry("Newcastle",3,8,0,0,50));
        league1.addEntry( new LeagueEntry("West Ham",1,8,0,0,30));
        league1.addEntry( new LeagueEntry("Arsenal",2,3,0,0,10));
        league1.addEntry( new LeagueEntry("United",3,10,0,0,30));
        league1.addEntry( new LeagueEntry("Man City",1,7,0,0,20));
        league1.addEntry( new LeagueEntry("Liverpool",2,7,0,0,20));

        league1.display();
        league1.sort();  // by natural ordering
        league1.display();

        league1.sortByGamesPlayedAscending();
        league1.display();

        //league1.sortByGamesPlayedDescending();
        // TODO - implement the above method
        league1.display();
    }
}