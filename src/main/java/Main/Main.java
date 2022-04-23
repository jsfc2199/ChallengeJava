package Main;

import Broker.Question.brkQuestion;
import BusinessRule.Player.clsPlayer;
import Model.mdlPlayer;
import Model.mdlQuestion;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int score = 0;

        for (int i = 1; i <= 5; i++) {
            mdlQuestion question = getRandomQuestion(i);
            Scanner sc = new Scanner(System.in);
            System.out.println("Please, select an option.");
            int userAnswer = sc.nextInt() - 1;
            if (userAnswer != -1) {
                if (validateAnswer(question.answer, userAnswer)) {
                    score += question.reward;
                    if (i == 5) {
                        quitGame(("Congratulations, you did very well, and you won " + score), score);
                        break;
                    }
                } else {
                    gameOver("Game Over. You lose\n");
                    break;
                }
            } else {
                quitGame(("You gave up, your score is " + score), score);
                break;
            }
        }
    }

    public static mdlQuestion getRandomQuestion(int category) {
        brkQuestion objQuestion = new brkQuestion();
        List<mdlQuestion> objMdlQuestion = objQuestion.getQuestionByCategory(category);
        int random = (int) Math.floor(Math.random() * 5);
        mdlQuestion question = objMdlQuestion.get(random);

        System.out.println(question.question);

        if (question.category != 1) {
            System.out.println("0. Quit");
        }

        for (int i = 0; i < question.option.length; i++) {
            System.out.println((i + 1) + ". " + question.option[i]);
        }

        return question;
    }

    public static mdlPlayer instantiatePlayer(int score) {
        Scanner texto = new Scanner(System.in);
        System.out.println("Please, enter your name");
        String name = texto.nextLine();
        mdlPlayer objMdlPlayer = new mdlPlayer(name, score);
        return objMdlPlayer;

    }

    public static boolean validateAnswer(int answer, int userAnswer) {
        if (userAnswer == answer) {
            return true;
        }
        return false;
    }

    public static void createPlayerBBDD(mdlPlayer player) {
        clsPlayer objClsPlayer = new clsPlayer();
        objClsPlayer.createPlayerBBDD(player);
    }

    public static void quitGame(String message, int score) {
        System.out.println(message);
        mdlPlayer objMdlPlayer = instantiatePlayer(score);
        createPlayerBBDD(objMdlPlayer);
        showRankingPlayers(getRankingPlayers());
    }

    public static void showRankingPlayers(List<mdlPlayer> lstMdlPlayer){
        for (int i = 0; i < lstMdlPlayer.size(); i++) {
            System.out.println(lstMdlPlayer.get(i).name + " " + lstMdlPlayer.get(i).score);
        }
    }

    public static void gameOver(String messsage) {
        System.out.println(messsage);
    }

    public static List<mdlPlayer> getRankingPlayers(){
        clsPlayer objClsPlayer = new clsPlayer();
        return objClsPlayer.getRankingPlayers();
    }
}
