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
        while (newPlayer.activeCareer()){
            if (simulate == 1){
                System.out.println(newPlayer.simulateYear());
                System.out.print("Simulate year? Enter 1: ");
                input = s.nextLine();
                simulate = Integer.parseInt(input);
            }
        }
        System.out.print(newPlayer.toString());





    }


}