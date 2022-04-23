package Main;

import Broker.Question.clsQuestion;
import Model.mdlQuestion;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        clsQuestion objQuestion = new clsQuestion();
        List<mdlQuestion> objMdlQuestion = objQuestion.fncGetQuestionByCategory(1);
        mdlQuestion pregunta = objMdlQuestion.get(0);
    }
}
