package BusinessRule.Question;

import Model.mdlQuestion;
import java.util.List;

public interface IClsQuestion {
    List<mdlQuestion> getQuestionByCategory(Integer category);
}
