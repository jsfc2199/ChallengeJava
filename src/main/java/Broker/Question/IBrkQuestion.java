package Broker.Question;

import Model.mdlQuestion;

import java.util.List;

public interface IBrkQuestion {
    List<mdlQuestion> getQuestions(Integer category);
}
