import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
public class Player {
    private String playerName;
    int matchesPlayed;
    int runs;
    int highestScore;
    String country;

    public Player(String playerName, int matchesPlayed, int runs, int highestScore, String country) {
        this.playerName = playerName;
        this.matchesPlayed = matchesPlayed;
        this.runs = runs;
        this.highestScore = highestScore;
        this.country = country;
    }
    public String getPlayerName() {
        return playerName;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public int getMatchesPlayed() {
        return matchesPlayed;
    }
    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }
    public int getRuns() {
        return runs;
    }
    public void setRuns(int runs) {
        this.runs = runs;
    }
    public int getHighestScore() {
        return highestScore;
    }
    public void setHighestScore(int d) {
        this.highestScore = d;
    }
    @Override
    public String toString() {
        return "[playerName=" + playerName + ", matchesPlayed=" + matchesPlayed + ", runs=" + runs
                + ", highestScore=" + highestScore + ", country=" + country + "]";
    }
}






