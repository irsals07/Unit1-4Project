import java.util.Scanner;

public class MethodTest {
    public static void main(String[] args) {
        String currentTeam = "Arsenal";
        Scanner s = new Scanner(System.in);
        String event1 = "You are running towards the goal in the final game of the season with the score being 1-1." +
                "\nHowever, right when you about to shoot, you are fouled and get a free kick at the 90th Minute. If you" +
                "\ncan score this you will win the league. Rewrite the name of your team backwards to score the free kick." +
                "\nYour current team is " + currentTeam + "(Case sensitivity does not matter): ";
        System.out.println(event1);
        String userInput = s.nextLine();
        String team = currentTeam;
        String reverse = "";
        team = currentTeam.toLowerCase();
        for (int i = 0; i < team.length(); i++){
            String character = team.substring(i, i+1);
            reverse = character + reverse;
        }
        if (userInput.equals(reverse)){
            System.out.print("good job");
        }
        else {
            System.out.print("bad job");
        }

    }
    public static String statsForSeason(){
        String position = ChooseTraits.choosePosition();
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





}



