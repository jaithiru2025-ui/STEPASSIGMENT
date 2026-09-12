package Week_05;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        Player[] players = {
                new Player("Virat", 15, 48.0, false),
                new Player("Rahul", 7, 55.0, false),
                new Player("Sameer", 3, 60.0, false),
                new Player("Dev", 12, 20.0, true)
        };
        System.out.println(draftAndRank(players));
    }

    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    static String draftAndRank(Player[] players) {
        Player[] temp = new Player[players.length];
        int count = 0;

        for (Player p : players) {
            boolean draftable = isDraftable(p.getMatchesPlayed())
                    || isDraftable(p.getMatchesPlayed(), p.isInjured());
            if (draftable) {
                temp[count++] = p;
            }
        }

        Player[] draftablePlayers = Arrays.copyOf(temp, count);
        Arrays.sort(draftablePlayers);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < draftablePlayers.length; i++) {
            result.append(i + 1).append(". ").append(draftablePlayers[i].getName());
            if (i != draftablePlayers.length - 1) {
                result.append(" | ");
            }
        }

        return result.toString();
    }
}

class Player implements Comparable<Player> {
    private String name;
    private int matchesPlayed;
    private double battingAverage;
    private boolean injured;

    public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    public String getName() {
        return name;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public boolean isInjured() {
        return injured;
    }

    @Override
    public int compareTo(Player other) {
        return Double.compare(other.battingAverage, this.battingAverage);
    }
}