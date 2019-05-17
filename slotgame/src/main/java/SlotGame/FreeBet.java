package SlotGame;

public class FreeBet {
    public static void makeFreeBet (double userMoney) {
        if (Math.random()<= Settings.CHANCE_TO_WIN_COINS) {
            System.out.println(Messages.USER_WON_MONEY);
            userMoney = userMoney + Settings.WON_COINS;
        }
        if (Math.random() <= Settings.CHANCE_TO_WIN_FREE_ROUND) {
            System.out.println(Messages.USER_WON_FREE_ROUND);
            makeFreeBet(userMoney);
        }
    }

}
