package Main;

import BusinessRule.Question.clsQuestion;
import BusinessRule.Player.clsPlayer;
import Model.mdlPlayer;
import Model.mdlQuestion;

import java.util.List;
import java.util.Scanner;

public class Game {

    static Scanner scanner = new Scanner(System.in);

    public static Integer mainMenu(){
        System.out.println(
                "\n****** MAIN MENU ********" + "\n" +
                        "0-Exit" + "\n" +
                        "1-Start Game" + "\n" +
                        "2-Ranking");
        return scanner.nextInt();
    }

    public static void playGame(){
        int score = 0;

        for (int i = 1; i <= 5; i++) {
            mdlQuestion question = getRandomQuestion(i);
            System.out.println("Please, select an option.");
            int userAnswer = scanner.nextInt();

            switch (userAnswer){
                case 0:
                    quitGame(("You gave up, your score is " + score), score);
                    break;
                case 1,2,3,4:
                    keepPlaying(question, userAnswer, score, i);
                    break;
                default:
                    System.out.println("Please select a valid option");
                    break;
            }
        }
    }

    private static void keepPlaying(mdlQuestion question, int userAnswer, int score, int i){
        if (validateAnswer(question.answer, userAnswer)) {
            score += question.reward;
            if (i == 5) {
                quitGame(("Congratulations, you did very well, your score is: " + score), score);
            }
        } else {
            System.out.println("Game Over. You lose\n");
        }
    }

    private static mdlQuestion getRandomQuestion(int category) {
        clsQuestion objClsQuestion = new clsQuestion();
        List<mdlQuestion> objMdlQuestion = objClsQuestion.getQuestionByCategory(category);

        int random = (int) Math.floor(Math.random() * 5);
        mdlQuestion question = objMdlQuestion.get(random);

        System.out.println(question.question);

        if (question.category != 1) {
            System.out.println("0. Give up");
        }

        for (int i = 0; i < question.option.length; i++) {
            System.out.println((i + 1) + ". " + question.option[i]);
        }

        return question;
    }

    private static void quitGame(String message, int score) {
        System.out.println(message);
        mdlPlayer objMdlPlayer = instantiatePlayer(score);
        createPlayerBBDD(objMdlPlayer);
        printRanking();
    }

    private static mdlPlayer instantiatePlayer(int score) {
        Scanner texto = new Scanner(System.in);
        System.out.println("Please, enter your name");
        String name = texto.nextLine();
        mdlPlayer objMdlPlayer = new mdlPlayer(name, score);
        return objMdlPlayer;
    }

    private static boolean validateAnswer(int answer, int userAnswer) {
        if (userAnswer == answer) {
            return true;
        }
        return false;
    }

    private static void createPlayerBBDD(mdlPlayer player) {
        clsPlayer objClsPlayer = new clsPlayer();
        objClsPlayer.createPlayerBBDD(player);
    }

    public static void printRanking(){
        clsPlayer objClsPlayer = new clsPlayer();
        List<mdlPlayer> lstMdlPlayer = objClsPlayer.getRankingPlayers();
        for (int i = 0; i < lstMdlPlayer.size(); i++) {
            System.out.println(lstMdlPlayer.get(i).name + " " + lstMdlPlayer.get(i).score);
        }
    }
}
