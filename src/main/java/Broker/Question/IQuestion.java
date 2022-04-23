package Broker.Question;

import Model.mdlQuestion;

import java.util.List;

public interface IQuestion {
    List<mdlQuestion> getQuestionByCategory(Integer category);
}
