import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

/**
 * The SoccerPlayerCareer class represents the player.
 * The player has a name, age, nationality, position, and team
 */


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

    private String input1;

    private String currentTeam;

    /**
     * Constructor for the SoccerPlayerCareer class. This createts a new instance
     * of the player given the below parameters
     *
     * @param playerName represents the name
     * @param age is the age of the player which starts at 16
     * @param nationality is the player's nationality which the player
     * @param position is the position of the player chosen with the ChooseTraits class
     * @param currentTeam is the team which is also chosen by the ChooseTraits class
     * @param totalAssists,
     * @param totalGoals,
     * @param totalCleanSheets,
     * @param awards
     * @param totalGames All the last 5 params start at 0 and are incremented as the players career go on and represent the stats of the player
     *
     */

    public SoccerPlayerCareer(String playerName, int age, String nationality, String position, String currentTeam, int totalGoals, int totalAssists, int totalGames, int totalCleanSheets, int awards) {
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

    /**
     The activeCareer method will return true while the player is younger than 36
     and still playing. When the player is 36, the activeCareer will return false
     and the player career will end

     @return whether the player is playing or not with true or false
     */

    public boolean activeCareer() {
        boolean playing = true;
        if (age == 36) {
            playing = false;
        }
        return playing;
    }


    /**
     *     simulateYear method uses the the statsForSeason method where when called,
     *      it will generate the random stats for the player depending on their position
     *      and also increase their age by 1
     * @return a string of all the stats from the simuateYear plus the age increase

     */

    public String simulateYear() {
        String stats = "";

        stats = statsForSeason();
        age++;
        return stats + "\nAge: " + age;
    }

    /**
     * statsForSeason method generates random stats for the player depending on their position
     * It also compares the stats with another set of random stats which is the opponent,
     * if the player can get higher stats than the opponent, they win the best player award
     * Goalkeepers cant win it because goalkeepers never win the award
     *
     * @return the variable stats; this includes all their stats like games, goals, assists or clean sheets depending on their position
     */


    public String statsForSeason() {
        String stats = "";
        if (position == "Attacker") {
            int games = (int) (Math.random() * 60) + 1;
            int goals = (int) (Math.random() * 60) + 1;
            int assists = (int) (Math.random() * 21);
            String awardWon = "No";
            totalGames = totalGames + games;
            totalGoals = totalGoals + goals;
            totalAssists = totalAssists + assists;
            if (goals > ((int) (Math.random() * 40) + 20)){
                awardWon = "Yes!!!!";
                awards++;
            }
            else{
                awardWon = "No";

            }
            stats = "Games: " + games + "\nGoals: " + goals + "\nassists: " + assists + "\nBest Player Award: " + awardWon;
        } else if (position == "Midfielder") {
            int games = (int) (Math.random() * 60) + 1;
            int goals = (int) (Math.random() * 20) + 1;
            int assists = (int) (Math.random() * 41);
            String awardWon = "No";
            totalGames = totalGames + games;
            totalGoals = totalGoals + goals;
            totalAssists = totalAssists + assists;
            if (assists > (int) (Math.random() * 20) + 15){
                awardWon = "Yes!!!!";
                awards++;
            }
            else{
                awardWon = "No";

            }
            stats = "Games: " + games + "\nGoals: " + goals + "\nassists: " + assists + "\nBest Player Award: " + awardWon;
        } else if (position == "Defender") {
            int games = (int) (Math.random() * 60) + 1;
            int goals = (int) (Math.random() * 10) + 1;
            int assists = (int) (Math.random() * 15);
            String awardWon = "No";
            totalGames = totalGames + games;
            totalGoals = totalGoals + goals;
            totalAssists = totalAssists + assists;
            if (goals > (int) (Math.random() * 20) + 1){
                awardWon = "Yes!!!!";
                awards++;
            }
            else{
                awardWon = "No";

            }
            stats = "Games: " + games + "\nGoals: " + goals + "\nassists: " + assists + "\nBest Player Award: " + awardWon;

        } else if (position == "Goalkeeper") {
            int games = (int) (Math.random() * 60) + 1;
            int cleanSheets = (int) (Math.random() * 51);
            stats = "Games: " + games + "\nClean Sheets: " + cleanSheets;
            totalGames = totalGames + games;
            totalCleanSheets = totalCleanSheets + cleanSheets;
        }
        return stats;

    }


    /**
     * toString method for the SoccerPlayerCareer class which returns the stats for the player depending on their positon
     * after every season
     *
     * @return the stats for the season
     */


    public String toString() {
        if (position == "Attacker" || position == "Midfielder" || position == "Defender") {
            double goalRatio = (double) totalGoals / totalGames;
            double assistRatio = (double) totalAssists / totalGames;
            return "Your final stats" +
                    "\nGames: " + totalGames +
                    "\nGoals: " + totalGoals +
                    "\nAssists: " + totalAssists +
                    "\nGoal Ratio: " + formatter.format(goalRatio) +
                    "\nAssist Ratio: " + formatter.format(assistRatio) +
                    "\nAwards Won: " + awards;
        } else {
            double ratio = (double) totalCleanSheets / totalGames;
            return "Your final stats" +
                    "\nGames: " + totalGames +
                    "\nClean Sheets: " + totalCleanSheets +
                    "\nClean Sheet Ratio: " + formatter.format(ratio);
        }
    }

    /**
     * event1 takes in the input of the player for the question
     * if the question matches with the answer, they win
     *
     * @return text of whether they did good or not
     */


    public String event1(String input1) {
        String reverse = "";
        String team = currentTeam.toLowerCase();
        for (int i = 0; i < team.length(); i++) {
            String character = team.substring(i, i + 1);
            reverse = character + reverse;
        }
        if (input1.equals(reverse)) {
            return "Good job, you scored the free kick and won the title";
        } else {
            return "Terrible Job! You put the entire team at risk";
        }
    }


}
