package BusinessRule.Question;

import Broker.Question.brkQuestion;
import Model.mdlQuestion;
import java.util.List;

public class clsQuestion implements IQuestion{
    @Override
    public List<mdlQuestion> getQuestionByCategory(Integer category) {
        brkQuestion objBrkQuestion = new brkQuestion();
        return objBrkQuestion.getQuestionByCategory(category);
    }
}
