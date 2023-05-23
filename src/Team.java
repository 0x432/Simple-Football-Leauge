import java.util.Collections;
import java.util.Comparator;
public class Team implements Comparable<Team>{

    private final String teamName;
    private int wins;
    private int loses;
    private int draws;
    private int points;

    public Team(String teamName, int wins, int draws, int loses) {
        this.teamName = teamName;
        this.wins = wins;
        this.draws = draws;
        this.loses = loses;
        this.points = CalculatePoints();
    }

    public String getTeamName() {
        return teamName;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getLoses() {
        return loses;
    }

    public int getPoints() {
        return points;
    }

    private int CalculatePoints() {
        return wins * 3 + draws;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public void setPoints() {
        this.points = CalculatePoints();
    }

    @Override
    public int compareTo(Team o) {
        return Integer.compare(o.getPoints(), this.points);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Team{")
                .append("teamName='").append(teamName).append("'")
                .append(", wins=").append(wins)
                .append(", draws=").append(draws)
                .append(", loses=").append(loses)
                .append(", points=").append(points)
                .append('}');
        return sb.toString();
    }


}
