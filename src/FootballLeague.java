import java.util.*;

public class FootballLeague {
    private final String LeagueName;
    private final List<Team> LeagueTeam;

    public FootballLeague(String LeagueName){
        this.LeagueName = LeagueName;
        this.LeagueTeam = new LinkedList<>();
    }

    public void addTeam(Team T) {
        LeagueTeam.add(T);
        Collections.sort(LeagueTeam);
    }

    public void relegateTeam() {
        int numTeams = LeagueTeam.size();
        if (numTeams > 3) {
            for (int i = 0; i < 3; i++) {
                LeagueTeam.remove(numTeams - i - 1);
            }
        }
        showLeagueTable();
    }

    public void updateScores(String teamname, int wins, int loses , int draws) {
        for (Team team : LeagueTeam) {
            if (team.getTeamName().equals(teamname)) {
                team.setWins(wins);
                team.setLoses(loses);
                team.setDraws(draws);
                team.setPoints();
                break;
            }
        }
        Collections.sort(LeagueTeam);
        showLeagueTable();
    }

    public void deleteTeam(String teamName) {
        Iterator<Team> iterator = LeagueTeam.iterator();
        while (iterator.hasNext()) {
            Team team = iterator.next();
            if (team.getTeamName().equals(teamName)) {
                iterator.remove();
                break;
            }
        }

        Collections.sort(LeagueTeam);
        showLeagueTable();
    }

    public void showLeagueTable() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %5s %5s %5s %5s %n", "Team Name", "Wins", "Loses", "Draws","points"));

        if (LeagueTeam.isEmpty()) {
            sb.append("No teams to display.");
        } else {
            for (Team team : LeagueTeam) {
                sb.append(String.format("%-20s %5d %5d %5d %5d %n",
                        team.getTeamName(),
                        team.getWins(),
                        team.getLoses(),
                        team.getDraws(),
                        team.getPoints()));
            }
        }

        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("FootballLeague{LeagueName='%s', LeagueTeam=[", Objects.toString(LeagueName)));

        for (Team team : LeagueTeam) {
            sb.append(String.format("%s, ", team.toString()));
        }

        sb.append("]}");
        return sb.toString();
    }
}


