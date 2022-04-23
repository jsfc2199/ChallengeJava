package Model;

public class mdlQuestion {
    public Integer id;
    public Integer category;
    public String question;
    public String[] option;
    public Integer answer;
    public Integer reward;

    public mdlQuestion(){
    }

    public mdlQuestion(Integer id, Integer category, String question, String[] option, Integer answer, Integer reward) {
         this.id = id;
         this.category = category;
         this.question = question;
         this.option = option;
         this.answer = answer;
         this.reward = reward;
    }
}
