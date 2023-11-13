import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class MainCareerSimulator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.00");

        // Getting user input
        ///Name
        System.out.println("Welcome to Soccer player simulator. You will create your own player and play their career and make a legacy for yourself" +
                "\nYou will play until you are 36 years old.");
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("Please enter your Players Name: ");
        String name = s.nextLine();
        System.out.println();
        System.out.println("---------------------------------------");
        // Nationality
        System.out.print("Please enter your Players Nation: ");
        String nationality = s.nextLine();

        ///Position
        String currentTeam = ChooseTraits.printTeamOptions();

        //Starting variables
        int age = 16;
        int totalGoals = 0;
        int totalAssists = 0;
        int totalGames = 0;
        int totalCleanSheets = 0;
        int awards = 0;

        //Position
        String position = ChooseTraits.choosePosition();
        //Object
        SoccerPlayerCareer newPlayer = new SoccerPlayerCareer(name, age, nationality, position, currentTeam, totalGoals, totalAssists, totalGames, totalCleanSheets, awards);
        System.out.println(newPlayer.simulateYear());

        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("Simulate year? Enter 1: ");
        String input = s.nextLine();
        int simulate = Integer.parseInt(input);
        int count = 0;
        while (newPlayer.activeCareer()){
            if (simulate == 1){
                System.out.println("--------------------------");
                System.out.println(newPlayer.simulateYear());
                System.out.print("Simulate year? Enter 1: ");
                input = s.nextLine();
                simulate = Integer.parseInt(input);

            }
            count++;
            if (simulate != 1){
                System.out.println("YOU DIDNT INPUT 1! TRY AGAIN");
                System.out.println("Simulate year? Enter 1: ");
                input = s.nextLine();
                simulate = Integer.parseInt(input);
            }
            if (count == 5) {
                System.out.println("You are running towards the goal in the final game of the season with the score being 1-1." +
                        "\nHowever, right when you about to shoot, you are fouled and get a free kick at the 90th Minute. If you" +
                        "\ncan score this you will win the league. Rewrite the name of your team backwards to score the free kick." +
                        "\nYour current team is " + currentTeam + "(enter in lowercase and make sure to include space): ");
                String userInput = s.nextLine();
                System.out.println(newPlayer.event1(userInput));
                System.out.println("Simulate year? Enter 1: ");
                input = s.nextLine();
                simulate = Integer.parseInt(input);
            }

        }
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.print(newPlayer.toString());


    }


}