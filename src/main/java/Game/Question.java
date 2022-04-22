package Game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Question implements Serializable {
    private String question; //se obtendrá de un array
    private int answer;   //se obtendrá de un array
    private String[] options;  //se obtendrá de un array
    private int category;    //sale del ciclo for desde 1

    public Question(String question, int answer, String[] options, int category) {
        this.question = question;
        this.answer = answer;
        this.options = options;
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public int getAnswer() {
        return answer;
    }

    public String[] getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "Question{" +
                "options=" + Arrays.toString(options) +
                '}';
    }
}
