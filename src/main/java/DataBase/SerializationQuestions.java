package DataBase;

import Game.Question;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class SerializationQuestions implements Serializable {

//    public Question readQuestionByCategory(int category, int randNumb)
//            throws IOException, ClassNotFoundException{
//        List<Question> fullQuestionList = new ArrayList<>();
//
//        FileInputStream fileInputStream = new FileInputStream("questionsDB.txt");
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        fullQuestionList = (ArrayList<Question>) objectInputStream.readObject();
//        objectInputStream.close();
////      FILTRAR fullQuestionList en base a la categoria
//        //Filtrar
//
////        for (int i = 0; i < q3.size(); i++) {
////            System.out.println(q3.get(i).toString());
////        }
//        return null;
//    }

    public void savingData()
            throws IOException, ClassNotFoundException {
        List<Question> lstQuestion = new ArrayList<>();

        lstQuestion.add(new Question("About what percentage of the Earth's surface is water?", 4, new String[]{"1. 15%", "2. 20%", "3. 8%", "4. 70%"}, 1));
        lstQuestion.add(new Question("What is the capital of Antioquia, Colombia?", 3, new String[]{"1. Apartadó", "2. Tunja", "3. Medellín", "4. Bogotá"}, 1));
        lstQuestion.add(new Question("Country to the east of Chile?", 1, new String[]{"1. Argentina", "2. Brazil", "3. Mexico", "4. Panama"}, 1));
        lstQuestion.add(new Question("What does “www” stand for in a website browser?", 2, new String[]{"1. Nothing", "2. World Wide Web", "3. Web Wide World", "4. World Will Web"}, 1));
        lstQuestion.add(new Question("In which country was the author Gabriel García Márquez born?", 4, new String[]{"1. Venezuela", "2. Ecuador", "3. Bolivia", "4. Colombia"}, 1));
        lstQuestion.add(new Question("What is the name of the holy book of Islamic culture?", 3, new String[]{"1. Talmud", "2. Torah", "3. Koran", "4. Kojiki"}, 2));
        lstQuestion.add(new Question("Someone is said to be famished when:", 1, new String[]{"1. Hungry", "2. Tired", "3. In love", "4. Afraid"}, 2));
        lstQuestion.add(new Question("Albinism is manifested by lack of?", 2, new String[]{"1. Calcium", "2. Pigmentation", "3. Sun", "4. Oxygen"}, 2));
        lstQuestion.add(new Question("What kind of musical instrument is the timpani?", 3, new String[]{"1. Strings", "2. Brasswind", "3. Percussion", "4. Woodwind"}, 2));
        lstQuestion.add(new Question("In the greek mythology, ¿Eros was considered the god of?", 4, new String[]{"1. Hate", "2. Fear", "3. Work", "4. Love"}, 2));
        lstQuestion.add(new Question("Which of these animals is a ruminant?", 4, new String[]{"1. Squirrel", "2. Snail", "3. Parrot", "4. Cow"}, 3));
        lstQuestion.add(new Question("How long is an Olympic swimming pool (in meters)?", 1, new String[]{"1. 50m", "2. 70m", "3. 100m", "4. 200m"}, 3));
        lstQuestion.add(new Question("What geometric shape is generally used for stop signs?", 3, new String[]{"1. Circle", "2. Hexagon", "3. Octagon", "4. Triangle"}, 3));
        lstQuestion.add(new Question("What part of the body is examined in an encephalography?", 2, new String[]{"1. Lungs", "2. Skull", "3. Kidney", "4. Heart"}, 3));
        lstQuestion.add(new Question("The Tour de France is a famous competition of:", 3, new String[]{"1. Golf", "2. Soccer", "3. Cycling", "4. Triathlon"}, 3));
        lstQuestion.add(new Question("How many languages are written from right to left?", 2, new String[]{"1. 6", "2. 12", "3. 18", "4. 9"}, 4));
        lstQuestion.add(new Question("What chemical element is represented by the symbol 'P'", 4, new String[]{"1. Bromine", "2. Boron", "3. Rubidium", "4. Phosphorus"}, 4));
        lstQuestion.add(new Question("Which of these names does not appear in the title of a play by Shakespeare?", 3, new String[]{"1. Hamlet", "2. Romeo", "3. Darren", "4. Macbeth"}, 4));
        lstQuestion.add(new Question("Which is the capital of Canada?", 3, new String[]{"1. Toronto", "2. Vancouver", "3. Ottawa", "4. Montreal"}, 4));
        lstQuestion.add(new Question("How many stripes does the United States flag have?", 1, new String[]{"1. 13", "2. 8", "3. 12", "4. 15"}, 4));
        lstQuestion.add(new Question("Where did the Etruscan civilization develop?", 1, new String[]{"1. Italian Peninsula", "2. Caucasus", "3. North of Africa", "4. Far East"}, 5));
        lstQuestion.add(new Question("Who was the first woman to win a Nobel Prize (in 1903)?", 2, new String[]{"1. Maria Goeppert Mayer", "2. Marie Curie", "3. Emmanuelle Charpentier", "4. Dorothy Crowfoot Hodgkin"}, 5));
        lstQuestion.add(new Question("The demolition of the Berlin wall separating East and West Germany began in what year?", 3, new String[]{"1. 1983", "2. 1992", "3. 1989", "4. 1978"}, 5));
        lstQuestion.add(new Question("How many time zones does Russia have?", 4, new String[]{"1. 7", "2. 8", "3. 13", "4. 11"}, 5));
        lstQuestion.add(new Question("Approximately how many kilometers long is the Andes mountain range?", 2, new String[]{"1. 3500", "2. 7000", "3. 12000", "4. 16000"}, 5));

        FileOutputStream fileOutputStream = new FileOutputStream("questionsDB.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(lstQuestion);
        objectOutputStream.flush();
        objectOutputStream.close();

//        FileInputStream fileInputStream = new FileInputStream("questionsDB.txt");
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        ArrayList<Question> fullQuestionList = (ArrayList<Question>) objectInputStream.readObject();
//        objectInputStream.close();
//
//        for (int i = 0; i < fullQuestionList.size(); i++) {
//            System.out.println(fullQuestionList.get(i).toString());
//        }
    }
}

