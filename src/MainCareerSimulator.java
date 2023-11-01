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

        //Position
        String position = ChooseTraits.choosePosition();

        SoccerPlayerCareer newPlayer = new SoccerPlayerCareer(name, age, nationality, position, currentTeam);


    }


}