package Model;

public class mdlPlayer extends mdlPerson{
    public String name;
    public Integer score;

    public mdlPlayer() {
    }

    public mdlPlayer(String name, Integer score) {
        super.name = name;
        this.score = score;
    }

    public Integer getScore(){
        return score;
    }
}
