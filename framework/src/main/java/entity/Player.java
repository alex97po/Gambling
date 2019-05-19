package entity;

/**
 * Class for entity Player
 * Two constructors enable to proceed game with finite or infinite amount of money
 */
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
