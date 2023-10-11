package org.example;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This League class encapsulates all data (fields) and behaviour (methods) that
 * are relevant to the League.
 * An internal ArrayList is used to store the list of Teams that play in this league.
 * A number of methods are defined here that allow us to manipulate the contents
 * of the League. (e.g addEntry(), sort(), display() )
 */
public class League {

    private ArrayList<LeagueEntry> teamsList;   // declare reference to the list

    public League() {
        this.teamsList = new ArrayList<>();  // instantiate ArrayList object
    }

    // Add an entry (a team) to the teamsList
    // Accept a reference to a LeagueEntry object and add that to the teamsList
    public void addEntry( LeagueEntry team){
        teamsList.add(team);
    }

    public void display(){
        System.out.println(teamsList);
    }

    // Define a sort method for a League object, which uses Collections.sort()
    // to sort the ArrayList based on Natural Ordering of LeagueEntry objects.
    // ( so, order is based on compareTo() defined in LeagueEntry class)
    public void sort() {
        Collections.sort(teamsList);  // will sort by Natural Ordering
    }

    // Method to sort the list in a specific order.
    // This is achieved by passing a Comparator object into the
    // Collections.sort() method.
    //
    public void sortByGamesPlayedAscending() {
        Collections.sort( teamsList, new GamesPlayedAscendingComparator() );
    }


}
