package org.example;
// Exercise SOLUTION

/**
 * This class represents a team (LeagueEntry) that would play in a league
 */

// Set the "Natural Ordering" by "implementing Comparable" interface,
// and overriding the compareTo() method.
//
// declaring that a class "implements the Comparable Interface" can be described as
// entering into a contract that states that this class must override the compareTo() method.
// The Collections.sort method requires that the class type of the elements in a list to be sorted
// must implement Comparable.
//
public class LeagueEntry implements Comparable<LeagueEntry>{

    private String name;
    private int played;
    private int won;
    private int lost;
    private int drew;
    private int totalPoints;

    public LeagueEntry(String name, int played, int won, int lost, int drew, int totalPoints) {
        this.name = name;
        this.played = played;
        this.won = won;
        this.lost = lost;
        this.drew = drew;
        this.totalPoints = totalPoints;
    }

    @Override
    public int compareTo(LeagueEntry otherTeam) {
        return this.name.compareTo(otherTeam.name);
        // above we are comparing LeagueEntry elements based solely on name.
        //TODO
        // Modify this code define the natural ordering of teams to be by points,
        // games won and names (in that order of priority)

    }
    @Override
    public String toString() {
        return "LeagueEntry{" +
                "name='" + name + '\'' +
                ", played=" + played +
                ", won=" + won +
                ", lost=" + lost +
                ", drew=" + drew +
                ", totalPoints=" + totalPoints +
                '}' +"\n";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getDrew() {
        return drew;
    }

    public void setDrew(int drew) {
        this.drew = drew;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
}
