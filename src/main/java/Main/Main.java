package Main;

import Broker.Question.clsQuestion;
import Model.mdlQuestion;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        clsQuestion objQuestion = new clsQuestion();

        //TODO: EL CICLO FOR EMPIEZA AQUÍ PARA PASARLE A fncGetQuestionByCategory UN VALOR DE 1 HASTA 5 (PUEDE SER UN FOR DESDE UN MÉTODO)

        List<mdlQuestion> objMdlQuestion = objQuestion.fncGetQuestionByCategory(); //pasar categoria ciclo for 1 - 5
        mdlQuestion question = objMdlQuestion.get((int) (Math.random() * 5));

        System.out.println(question.question);
        for (int i = 0; i < question.option.length; i++) {
            System.out.println((i + 1) + ". " + question.option[i]);
        }

        int score = 0; //variable temporal

        //TODO: refactorizar porque si "funciona", si es true sumar a un acumulador el premio
        if(validateAnswer(question.answer)){
            score+= question.reward; //sumará al valor a score para el puntaje final
            System.out.println(":3");
        };

        System.out.println(score);

    }
    //TODO: METODO QUE RECIBA LA VALIDACION DE LA PREGUNTA PARA PODER CONTINUAR CON EL JUEGO

    //valida la respuesta correcta y retorna un booleano
    public static boolean validateAnswer(int answer) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingresa la respuesta correcta");
        int userAnswer = sc.nextInt()-1;
        if (userAnswer == answer) {
            return true;
        }
        return false;
    }
}
