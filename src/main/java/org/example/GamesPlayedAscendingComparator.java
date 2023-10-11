package org.example;

import java.util.Comparator;

// This class implements the Comparator interface. So, it is a Comparator.
// This means that it enters into the Comparator contract that requires it
// to override the compare(t1,t2) method.
// The Comparator can be instantiated (using new...) and passed into a sort() method
// to determine the sort order.
//
public class GamesPlayedAscendingComparator implements Comparator<LeagueEntry> {

    @Override
    public int compare(LeagueEntry team1, LeagueEntry team2) {
        return team1.getPlayed() - team2.getPlayed();
        // returns :
        // negative (indicates elements are in ascending order),
        // zero (indicates that objects are the same),
        // or positive (indicates that they are out of order)
    }
}
