package Main;

import BusinessRule.Player.IClsPlayer;
import BusinessRule.Player.clsPlayer;
import BusinessRule.Question.IClsQuestion;
import BusinessRule.Question.clsQuestion;
import Model.mdlPlayer;
import Model.mdlQuestion;

import java.util.List;
import java.util.Scanner;

public class Game {

    static private Scanner scanner = new Scanner(System.in);
    static private int score = 0;

    public static Integer mainMenu(){
        System.out.println(
                "\n****** MAIN MENU ********" + "\n" +
                        "0-Exit" + "\n" +
                        "1-Start Game" + "\n" +
                        "2-Ranking");
        return scanner.nextInt();
    }

    public static void playGame(){
        boolean playing = true;
        int i = 1;

        while (playing && i<=5) {
            mdlQuestion question = getRandomQuestion(i);
            System.out.println("Please, select an option.");
            int userAnswer = scanner.nextInt();

            switch (userAnswer){
                case 0:
                    quitGame(("You gave up, your score is " + score));
                    playing = false;
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                    playing = keepPlaying(question, userAnswer-1, i);
                    i++;
                    break;
                default:
                    System.out.println("Please select a valid option");
                    break;
            }
        }
    }

    private static mdlQuestion getRandomQuestion(int category) {
        IClsQuestion objClsQuestion = new clsQuestion();
        List<mdlQuestion> objMdlQuestion = objClsQuestion.getQuestionByCategory(category);

        int random = (int) Math.floor(Math.random() * 5);
        mdlQuestion question = objMdlQuestion.get(random);

        System.out.println(question.question);
        System.out.println("0. Give up");

        for (int i = 0; i < question.option.length; i++) {
            System.out.println((i + 1) + ". " + question.option[i]);
        }

        return question;
    }

    private static void quitGame(String message) {
        System.out.println(message);
        mdlPlayer objMdlPlayer = instantiatePlayer();
        createPlayer(objMdlPlayer);
        score = 0;
    }

    private static boolean keepPlaying(mdlQuestion question, int userAnswer, int i){
        if (validateAnswer(question.answer, userAnswer)) {
            score += question.reward;
            if (i == 5) {
                quitGame(("Congratulations, you did very well, your score is: " + score));
            }
            return true;
        }
        gameOver();
        return false;
    }

    private static void gameOver(){
        System.out.println("Game Over. You lose\n");
        score = 0;
    }

    private static boolean validateAnswer(int answer, int userAnswer) {
        if (userAnswer == answer) {
            return true;
        }
        return false;
    }

    private static mdlPlayer instantiatePlayer() {
        Scanner texto = new Scanner(System.in);
        System.out.println("Please, enter your name");
        String name = texto.nextLine();
        mdlPlayer objMdlPlayer = new mdlPlayer(name, score);
        return objMdlPlayer;
    }

    private static void createPlayer(mdlPlayer player) {
        IClsPlayer objClsPlayer = new clsPlayer();
        objClsPlayer.createPlayer(player);
    }

    public static void printRanking(){
        IClsPlayer objClsPlayer = new clsPlayer();
        List<mdlPlayer> lstMdlPlayer = objClsPlayer.getRankingPlayers();
        System.out.println("");
        for (int i = 0; i < lstMdlPlayer.size(); i++) {
            System.out.println(i+1 + "." + lstMdlPlayer.get(i).name + " " + lstMdlPlayer.get(i).score);
        }
    }
}
