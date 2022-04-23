package BusinessRule.Question;

import Model.mdlQuestion;
import java.util.List;

public interface IQuestion {
    List<mdlQuestion> fncGetQuestions(mdlQuestion objMdlQuestion);
}
