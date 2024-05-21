# Simple Football League

## Description

The Simple Football League project includes three Java programs (`Dashboard.java`, `FootballLeague.java`, and `Team.java`) that simulate the management of a football league. This program was created to complete an aspect of the Algorithms and Data Structures assignment by the University of Huddersfield.

## Usage

### 1. Dashboard.java
**Functionality:**
- This program serves as the entry point for managing the football league.
- It initializes a league, adds teams, displays the league table, deletes a team, relegates a team, and updates scores.

### 2. FootballLeague.java
**Functionality:**
- This program defines the `FootballLeague` class.
- It manages a list of `Team` objects, including adding, deleting, relegating teams, updating scores, and displaying the league table.

### 3. Team.java
**Functionality:**
- This program defines the `Team` class.
- It includes attributes for team name, wins, draws, losses, and points, along with methods to manipulate and retrieve these values.

## How It Works

- **League Initialization:** The `Dashboard` initializes a `FootballLeague` with several `Team` objects.
- **Team Management:** Teams are added to the league, and their performance is tracked using the `Team` class methods.
- **Displaying League Table:** The `showLeagueTable` method in `FootballLeague` displays the teams sorted by their points.
- **Updating Scores:** Scores are updated using the `updateScores` method, which modifies the wins, draws, and losses of a team.

## Example

```java
FootballLeague League = new FootballLeague("League Two");
League.addTeam(new Team("Stevenage", 15, 6, 3));
League.showLeagueTable();
League.deleteTeam("Sutton United");
League.relegateTeam();
League.updateScores("Grimsby Town", 25, 0, 0);
```

## Requirements

- Java Development Kit (JDK)

## Compilation and Execution

To compile and run the program, use the following commands:

```sh
javac Team.java
javac FootballLeague.java
javac Dashboard.java
java Dashboard
```
Ensure that all the `.java` files are in the same directory when compiling and running the program.


