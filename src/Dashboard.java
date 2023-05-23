public class Dashboard {
    public static void main(String[] args) {

        FootballLeague League = new FootballLeague("League Two");

        League.addTeam(new Team("Stevenage",15,6, 3));
        League.addTeam(new Team("Salford City",11,5, 8));
        League.addTeam(new Team("Bradford City",11,6, 6));
        League.addTeam(new Team("Crewe Alexandra",7,8, 8));
        League.addTeam(new Team("Leyton Orient",17,5, 3));
        League.addTeam(new Team("Swindon Town",10,8, 7));
        League.addTeam(new Team("Northampton Town",13,7, 5));
        League.addTeam(new Team("Barrow",12,3, 10));
        League.addTeam(new Team("Salford City",11,5, 8));
        League.addTeam(new Team("Mansfield Town",11,5, 9));
        League.addTeam(new Team("Doncaster Rovers",11,4, 10));
        League.addTeam(new Team("Walsall",10,6, 7));
        League.addTeam(new Team("Sutton United",10,6, 10));
        League.addTeam(new Team("AFC Wimbledon",9,8, 8));
        League.addTeam(new Team("Stockport County",10,4, 9));
        League.addTeam(new Team("Grimsby Town",8,6, 9));
        League.addTeam(new Team("Newport County",6,8, 11));
        League.addTeam(new Team("Hartlepool United",4,7, 13));
        League.addTeam(new Team("Harrogate Town",6,5, 13));
        League.addTeam(new Team("Tranmere Rovers",9,7, 9));
        League.addTeam(new Team("Colchester United",6,5, 14));
        League.addTeam(new Team("Gillingham",2,8, 13));
        League.addTeam(new Team("Crawley Town",5,7, 12));
        League.addTeam(new Team("Carlisle United",10,9, 5));
        League.addTeam(new Team("Rochdale",4,5, 15));

        League.showLeagueTable();

        League.deleteTeam("Sutton United");

        League.relegateTeam();

        League.updateScores("Grimsby Town",25, 0 , 0);

    }
}
