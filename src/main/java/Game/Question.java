package Game;

public class Question {
    private String question; //se obtendrá de un array
    private String answer;   //se obtendrá de un array
    private String options;  //se obtendrá de un array
    private int category;    //sale del ciclo for desde 1

    public Question(String question, String answer, String options, int category) {
        this.question = question;
        this.answer = answer;
        this.options = options;
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getOptions() {
        return options;
    }
}
