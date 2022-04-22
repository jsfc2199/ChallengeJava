package Main;


import Game.IntroductionQuestion;
import Game.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("juan",0);

        int[] victorias = {0, 500, 1000, 10000, 45000, 100000};
        String[] categorias = {"Arte y Cine", "Matemáticas", "Deportes", "Música", "Ciencia"};
        int puntaje = 0;


        for (int i = 1; i <= 5; i++) {
            System.out.println(IntroductionQuestion.introduction(i,victorias[i]));
        }
    }
}
