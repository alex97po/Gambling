package Entity;

public abstract class Game {
    private static double money;
    private Bet bet;
    public Game (double money) {
        this.money = money;
    }
    public static boolean validateUserHasEnoughMoney (int userMoney, int betPrice, String luckOfMoneyMessage) {
        if (userMoney < betPrice) {
            System.out.println(luckOfMoneyMessage);
            return false;
        }else
            return true;
    }
}
