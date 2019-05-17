package SlotGame;

public class NormalBet {
    private static FreeBet freeBet;
    public static double makeNormalBet (double money) {
        money = money - Settings.BET_PRICE;
        if (Math.random()<= Settings.CHANCE_TO_WIN_COINS) {
            System.out.println(Messages.USER_WON_MONEY);
            money = money + Settings.WON_COINS;
        }
        if (Math.random() <= Settings.CHANCE_TO_WIN_FREE_ROUND) {
            System.out.println(Messages.USER_WON_FREE_ROUND);
            freeBet = new FreeBet();
            money = freeBet.makeFreeBet(money);
        }
        System.out.println(Messages.USER_MONEY + money);
        return money;
    }
}
