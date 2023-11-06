public class MethodTest {
    public static void main(String[] args) {
         int age = 16;
        while (age < 18){
            String stats = "";
            stats = statsForSeason();
            age++;
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



