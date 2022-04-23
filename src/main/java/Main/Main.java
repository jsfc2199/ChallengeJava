package Main;

import Broker.Question.clsQuestion;
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
        clsQuestion objQuestion = new clsQuestion();
        List<mdlQuestion> objMdlQuestion = objQuestion.fncGetQuestionByCategory(category); //pasar categoria ciclo for 1 - 5
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

    //al final, si gana o si se retira
    public static mdlPlayer instantiatePlayer(int score) {
        Scanner texto = new Scanner(System.in);
        System.out.println("Please, enter your name");
        String name = texto.nextLine();
        mdlPlayer objMdlPlayer = new mdlPlayer(name, score);
        return objMdlPlayer;

    }
    //TODO: METODO QUE RECIBA LA VALIDACION DE LA PREGUNTA PARA PODER CONTINUAR CON EL JUEGO

    //valida la respuesta correcta y retorna un booleano
    public static boolean validateAnswer(int answer, int userAnswer) {
        if (userAnswer == answer) {
            return true;
        }
        return false;
    }

    //guarda en objeto en el Json
    public static void savePlayerBBDD(mdlPlayer player) {
        clsPlayer objClsPlayer = new clsPlayer();
        objClsPlayer.fncCreatePlayer(player);
    }

    public static void quitGame(String message, int score) {
        System.out.println(message);
        mdlPlayer objMdlPlayer = instantiatePlayer(score);
        savePlayerBBDD(objMdlPlayer);
    }

    public static void gameOver(String messsage) {
        System.out.println(messsage);
    }

}
