package Main;

public class Main {
    public static void main(String[] args) {

        boolean play = true;
        while (play){
            switch (Game.mainMenu()){
                case 0:
                    play = false;
                    break;
                case 1:
                    Game.playGame();
                    break;
                case 2:
                    Game.printRanking();
                    break;
                default:
                    System.out.println("Please select a valid option");
                    break;
            }
        }
    }
}
