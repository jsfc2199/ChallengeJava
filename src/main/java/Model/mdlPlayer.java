package Model;

public class mdlPlayer {
    public String name;
    public Integer score;

    public mdlPlayer() {
    }

    public mdlPlayer(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public Integer getScore(){
        return score;
    }
}
