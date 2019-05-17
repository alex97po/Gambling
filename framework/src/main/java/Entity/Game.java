package Entity;

public abstract class Game {
    private static double money;

    public Game (double money) {
        this.money = money;
    }

    public static double getMoney() {
        return money;
    }


    public void makeBet() {

    }
}
