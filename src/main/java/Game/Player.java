package Game;

public class Player {
    private String name;
    private int acumPrize;

    public Player(String name, int acumPrize) {
        this.name = name;
        this.acumPrize = acumPrize;
    }

    public String getName() {
        return name;
    }

    public int getAcumPrize() {
        return acumPrize;
    }

    public void setAcumPrize(int acumPrize) {
        this.acumPrize = acumPrize;
    }
}
