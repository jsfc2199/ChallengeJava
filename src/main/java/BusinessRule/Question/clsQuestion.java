package BusinessRule.Question;

import Broker.Question.IBrkQuestion;
import Broker.Question.brkQuestion;
import Model.mdlQuestion;

import java.util.List;
import java.util.stream.Collectors;

public class clsQuestion implements IClsQuestion {
    @Override
    public List<mdlQuestion> getQuestionByCategory(Integer category) {
        IBrkQuestion objBrkQuestion = new brkQuestion();
        List<mdlQuestion> lstMdlQuestion = objBrkQuestion.getQuestions(category);

        return lstMdlQuestion.stream()
                .filter( question -> question.category == category).collect(Collectors.toList());
    }
}
