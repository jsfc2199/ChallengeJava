package Main;

import DataBase.SerializationQuestions;
import Game.Round;

import java.io.IOException;

public class Main {

    public static void manageQuestionDB(){
        SerializationQuestions saveData = new SerializationQuestions();
        try {
            saveData.savingData();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        manageQuestionDB();


    }
}
