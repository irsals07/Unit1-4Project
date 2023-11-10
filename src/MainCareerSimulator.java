import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class MainCareerSimulator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.00");

        // Getting user input
        ///Name
        System.out.print("Please enter your Players Name: ");
        String name = s.nextLine();

        // Nationality
        System.out.print("Please enter your Players Nation: ");
        String nationality = s.nextLine();

        ///Position
        String currentTeam = ChooseTraits.printTeamOptions();

        //Age
        int age = 16;
        int totalGoals = 0;
        int totalAssists = 0;
        int totalGames = 0;
        int totalCleanSheets = 0;
        int awards = 0;
        //Position

        String position = ChooseTraits.choosePosition();
        SoccerPlayerCareer newPlayer = new SoccerPlayerCareer(name, age, nationality, position, currentTeam, totalGoals, totalAssists, totalGames, totalCleanSheets, awards);
        System.out.println(newPlayer.simulateYear());

        System.out.print("Simulate year? Enter 1: ");
        String input = s.nextLine();
        int simulate = Integer.parseInt(input);
        int count = 0;
        while (newPlayer.activeCareer()){
            if (simulate == 1){
                System.out.println(newPlayer.simulateYear());
                System.out.print("Simulate year? Enter 1: ");
                input = s.nextLine();
                simulate = Integer.parseInt(input);

            }
            count++;
            if (count == 5) {
                System.out.println("You are running towards the goal in the final game of the season with the score being 1-1." +
                        "\nHowever, right when you about to shoot, you are fouled and get a free kick at the 90th Minute. If you" +
                        "\ncan score this you will win the league. Rewrite the name of your team backwards to score the free kick." +
                        "\nYour current team is " + currentTeam + "(Case sensitivity does not matter and make sure to include space): ");
                String userInput = s.nextLine();
                System.out.println(newPlayer.event1(userInput));
            }
            if (count == 10) {
                System.out.println("You are playing a world cup game to finally bring your nation the most sought after award in the sport" +
                        "\n However, while the game is 2-2, you go for the ball and tackle the player really hard and the referee wants" +
                        "\n to give you a red card. If you get a red card, your team will most likely lose the tournament. Type the name of your " +
                        "\n nationality to secure you dont get a red card. Your nationality is " + nationality + " (Case sensitivity does not matter" +
                        "\n and make sure to include space): ");
                String userInput = s.nextLine();
                System.out.println(newPlayer.event2(userInput));
            }
        }
        System.out.print(newPlayer.toString());


    }


}