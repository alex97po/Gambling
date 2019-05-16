public class RoundSlot {
    private static int money;
    public static int moneySpent;
    public static int moneyWon;

    public RoundSlot(int money) {
        this.money = money;
    }

    public static boolean validateUserHasEnoughMoney (int userMoney) {
        if (userMoney< Settings.BET_PRICE) {
            System.out.println(Messages.LACK_OF_MONEY);
            return false;
        }else
            return true;
    }

    public static void bet () {
        if (validateUserHasEnoughMoney(money)) {
            money = money - Settings.BET_PRICE;
            moneySpent+= Settings.BET_PRICE;
            if (Math.random()<= Settings.CHANCE_TO_WIN_COINS) {
                System.out.println(Messages.USER_WON_MONEY);
                money = money + Settings.WON_COINS;
                moneyWon+= Settings.WON_COINS;
            }
            if (Math.random() <= Settings.CHANCE_TO_WIN_FREE_ROUND) {
                System.out.println(Messages.USER_WON_FREE_ROUND);
                freeBet(money);
            }
            System.out.println(Messages.USER_MONEY + money);
        }
    }

    public static void freeBet (int userMoney) {
        if (Math.random()<= Settings.CHANCE_TO_WIN_COINS) {
            System.out.println(Messages.USER_WON_MONEY);
            userMoney = userMoney + Settings.WON_COINS;
            moneyWon+= Settings.WON_COINS;
        }
        if (Math.random() <= Settings.CHANCE_TO_WIN_FREE_ROUND) {
            System.out.println(Messages.USER_WON_FREE_ROUND);
            freeBet(userMoney);
        }
    }
}
