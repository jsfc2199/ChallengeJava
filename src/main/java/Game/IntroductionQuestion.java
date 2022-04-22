package Game;

public class IntroductionQuestion {
    
    public static String introduction(int lvl, int prize){
        String introductionQuesiton [] = new String [5];

        introductionQuesiton[0] = "Here goes question #" + lvl + " for $" + prize+ " dollars.";
        introductionQuesiton[1] = "Now let's go with question #" + lvl + " for $" + prize+ " dollars.";
        introductionQuesiton[2] = "Question #" + lvl + " for $" + prize+ " dollars.";
        introductionQuesiton[3] = "We continue with question #" + lvl + " which will give you $" + prize+ " dollars.";
        introductionQuesiton[4] = "Now it's the turn of question #" + lvl + " . You will win $" + prize+ " dollars.";

        double randomQuestion =  Math.random()*5;
        int randomIntroduction = (int) randomQuestion;

        return introductionQuesiton[randomIntroduction];
    }
}
