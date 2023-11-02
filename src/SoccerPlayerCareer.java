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
private String currentTeam;
    public SoccerPlayerCareer(String playerName, int age, String nationality, String position, String currentTeam){
        this.playerName = playerName;
        this.age = age;
        this.nationality = nationality;
        this.position = position;
        this.currentTeam = currentTeam;
    }

    public String activeCareer(){
        boolean retired = false;
        while (retired == false){
            statsForSeason();
            age++;
            retired();
        }
        return "career finished";
    }

    public String changeTeam(){
        currentTeam = ChooseTraits.printTeamOptions();
        return currentTeam;
    }

    public String statsForSeason(){
        String stats = "";
        if (position == "Attacker"){
            int games = 50;
            int goals = (int)(Math.random()*60)+1;
            int assists = (int)(Math.random()*21);
            stats = "Games: " + games + "\nGoals: " + goals + "\nassists: " + assists;
        }
        else if (position == "Midfielder"){
            int games = 50;
            int goals = (int)(Math.random()*20)+1;
            int assists = (int)(Math.random()*41);
            stats = "Games: " + games + "\nGoals: " + goals + "\nassists: " + assists;
        }
        else if (position == "Defender"){
            int games = 50;
            int goals = (int)(Math.random()*10)+1;
            int assists = (int)(Math.random()*15);
            stats = "Games: " + games + "\nGoals: " + goals + "\nassists: " + assists;
        }
        else if (position == "Goalkeeper"){
            int games = 50;
            int cleanSheets = (int)(Math.random()*51);
            stats = "Games: " + games + "\nClean Sheets: " + cleanSheets;
        }
        return stats;

    }
    public boolean retired(){
        System.out.print("Do you wish to retire (y or n)");
        String retire = s.nextLine();
        if (retire == "y"){
            return false;
        }
        else {
            return true;
        }
    }



    
}
