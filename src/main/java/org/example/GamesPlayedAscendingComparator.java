package org.example;

import java.util.Comparator;

public class GamesPlayedAscendingComparator implements Comparator<LeagueEntry> {

    @Override
    public int compare(LeagueEntry team1, LeagueEntry team2) {
        return team1.getPlayed() - team2.getPlayed();
        // returns negative (indicates in order),
        // zero (indicates that objects are the same),
        // or positive (indicates that they are out of order)
    }
}
