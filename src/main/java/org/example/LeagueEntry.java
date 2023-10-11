package org.example;
// Exercise SOLUTION

// set Natural Ordering by "implementing Comparable" interface,
// and overriding the compareTo() method
public class LeagueEntry {

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

}
