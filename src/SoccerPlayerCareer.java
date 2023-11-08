import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class SoccerPlayerCareer {
    Scanner s = new Scanner(System.in);
    NumberFormat formatter = new DecimalFormat("#0.00");

//Instance variables will include the: market value, current team, salary, totalGoals,
// totalAssists, totalCleanSheets, totalAwards, and totalTrophies

private String playerName;
private int age;
private String nationality;
private String position;

private int totalGoals;
private int totalAssists;
private int totalCleanSheets;
private int totalGames;
private int awards;

private String currentTeam;
    public SoccerPlayerCareer(String playerName, int age, String nationality, String position, String currentTeam, int totalGoals, int totalAssists, int totalGames, int totalCleanSheets, int awards){
        this.playerName = playerName;
        this.age = age;
        this.nationality = nationality;
        this.position = position;
        this.currentTeam = currentTeam;
        this.totalGoals = totalGoals;
        this.totalAssists = totalAssists;
        this.totalGames = totalGames;
        this.totalCleanSheets = totalCleanSheets;
        this.awards = awards;
    }


// Active career will allow the program to run as long as the playing boolean is true, otherwise it will return false
    public Boolean activeCareer(){
        boolean playing = true;
        if (age == 36){
            playing = false;
        }
        return playing;
    }

    //Simulate Year method uses the stats for season that randomly generate the games and stats for the player depending on their position and returns it
    // It also increases the age
    public String simulateYear(){
        String stats = "";

        stats = statsForSeason();
        age++;
        if (bestPlayer()){
            awards++;
        }
        return stats + "\nAge: " + age;
    }



    public boolean bestPlayer(){
        int yourVotes = (int)(Math.random()*60)+1;
        int opponentOneVotes = (int)(Math.random()*60)+1;
        int opponentTwoVotes = (int)(Math.random()*60)+1;
        if (yourVotes > opponentOneVotes && yourVotes > opponentTwoVotes){
            return true;
        }
        else{
            return false;
        }
    }



    public String statsForSeason(){
        String stats = "";
        if (position == "Attacker"){
            int games = 50;
            int goals = (int)(Math.random()*60)+1;
            int assists = (int)(Math.random()*21);
            stats = "Games: " + games + "\nGoals: " + goals + "\nassists: " + assists;
            totalGames = totalGames + games;
            totalGoals = totalGoals + goals;
            totalAssists = totalAssists + assists;
        }
        else if (position == "Midfielder"){
            int games = 50;
            int goals = (int)(Math.random()*20)+1;
            int assists = (int)(Math.random()*41);
            stats = "Games: " + games + "\nGoals: " + goals + "\nassists: " + assists;
            totalGames = totalGames + games;
            totalGoals = totalGoals + goals;
            totalAssists = totalAssists + assists;
        }
        else if (position == "Defender"){
            int games = 50;
            int goals = (int)(Math.random()*10)+1;
            int assists = (int)(Math.random()*15);
            stats = "Games: " + games + "\nGoals: " + goals + "\nassists: " + assists;
            totalGames = totalGames + games;
            totalGoals = totalGoals + goals;
            totalAssists = totalAssists + assists;
        }
        else if (position == "Goalkeeper"){
            int games = 50;
            int cleanSheets = (int)(Math.random()*51);
            stats = "Games: " + games + "\nClean Sheets: " + cleanSheets;
            totalCleanSheets = totalCleanSheets + cleanSheets;
        }
        return stats;

    }
    public String toString(){
        if (position == "Attacker" && position == "Midfielder" && position == "Defender"){
            return "Your final stats" +
                    "\nGames: " + totalGames +
                    "\nGoals: " + totalGoals +
                    "\nAssists: " + totalAssists +
                    "\nGoal Ratio: " + totalGoals/totalGames +
                    "\nAssist Ratio" + totalAssists/totalGames;
        }
        else{
            return "Your final stats" +
                    "\nGames: " + totalGames +
                    "\nClean Sheets: " + totalCleanSheets +
                    "\nClean Sheet Ratio: " + totalGames/totalCleanSheets;
        }
    }
}
