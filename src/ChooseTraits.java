import java.util.Scanner;

public class ChooseTraits {

    public static String printTeamOptions(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please select a number for the country to play in" +
                "\n1. England" +
                "\n2. Spain" +
                "\n3. Germany" +
                "\n4. Italy" +
                "\n5. France");
        String countryPlaying = s.nextLine();
        int country = Integer.parseInt(countryPlaying);
        if (country == 1){
            String England =  "Team | Games Played | Wins | Draws | Loses |Goals For | Goals Against | Points\n" +
                    "1\tManchester City (C)\t38\t89\n" +
                    "2\tArsenal\t38\t84\n" +
                    "3\tManchester United\t38\t75\n" +
                    "4\tNewcastle United\t38\t71\n" +
                    "5\tLiverpool\t38\t67\n" +
                    "6\tBrighton & Hove Albion\t38\t62\n" +
                    "7\tAston Villa\t38\t61\n" +
                    "8\tTottenham Hotspur\t38\t6";
            System.out.println(England);
        }
        else if (country == 2){
            String Spain = "Team | Games Played | Wins | Draws | Loses |Goals For | Goals Against | Points\n" +
                    "1\tBarcelona (C)\t38\t28\t4\t6\t70\t20\t+50\t88\n" +
                    "2\tReal Madrid\t   38\t24\t6\t8\t75\t36\t+39\t78\n" +
                    "3\tAtlético Madrid\t38\t23\t8\t7\t70\t33\t+37\t77\n" +
                    "4\tReal Sociedad\t38\t21\t8\t9\t51\t35\t+16\t71";
            System.out.println(Spain);
        }
        else if (country == 3){
            String Germany = "Team | Games Played | Wins | Draws | Loses |Goals For | Goals Against | Points\n" +
                    "1\tBayern Munich (C)\t34\t71\n" +
                    "2\tBorussia Dortmund\t34\t71\n" +
                    "3\tRB Leipzig\t34\t66\n" +
                    "4\tUnion Berlin\t34\t62";
            System.out.println(Germany);
        }
        else if (country == 4){
            String Italy = "Team | Games Played | Wins | Draws | Loses |Goals For | Goals Against | Points\n" +
                    "1\tNapoli (C)\t38\t90\n" +
                    "2\tLazio\t38\t74\n" +
                    "3\tInter Milan\t38\t72\n" +
                    "4\tAC Milan\t38\t70";
                    System.out.println(Italy);
        }
        else if (country == 5){
            String France = "Team | Games Played | Wins | Draws | Loses |Goals For | Goals Against | Points\n" +
                    "1\tParis Saint-Germain (C)\t38\t85\n" +
                    "2\tLens\t38\t84\n" +
                    "3\tMarseille\t38\t73";
            System.out.println(France);

        }
        System.out.println("Type The NAME of the team you would like to join");
        String team = s.nextLine();
        return team;

    }

    public static String choosePosition(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please choose a position to play (Type the number):" +
                "\n 1. Attacker" +
                "\n 2. Midfielder" +
                "\n 3. Defender" +
                "\n 4. Goalkeeper");
        String position = s.nextLine();
        String playingPosition = "";
        int chosenPosition = Integer.parseInt(position);
        if (chosenPosition == 1){
            playingPosition = "Attacker";
        }
        else if (chosenPosition == 2){
            playingPosition = "Midfielder";
        }
        else if (chosenPosition == 3){
            playingPosition = "Defender";
        }
        else if (chosenPosition == 4){
            playingPosition = "Goalkeeper";
        }
        return playingPosition;
    }

}
