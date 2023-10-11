package org.example;
import java.util.ArrayList;
import java.util.Collections;

public class League {
    ArrayList<LeagueEntry> teamsList;

    public League() {
        this.teamsList = new ArrayList<>();  // instantiate ArrayList object
    }

     // Add an entry (a team) to the teamsList
    public void addEntry( LeagueEntry team){
        teamsList.add(team);
    }

    public void display(){
        System.out.println(teamsList);
    }

    // Define a sort method for a League object, which uses Collections.sort()
    // to sort the ArrayList based on Natural Ordering of LeagueEntry objects.
    //
    public void sort() {
        Collections.sort(teamsList);  // will sort by Natural Ordering
    }

    public void sortByGamesPlayedAscending() {
        Collections.sort( teamsList, new GamesPlayedComparator() );
    }


}
