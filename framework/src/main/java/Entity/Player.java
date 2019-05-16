package Entity;

public class Player {
    private static double moneyAmount;

    public static double getMoneyAmount() {
        return moneyAmount;
    }

    public Player (int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public Player () {
        this.moneyAmount = Double.POSITIVE_INFINITY;
    }
}
