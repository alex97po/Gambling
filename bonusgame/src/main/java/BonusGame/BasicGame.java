package BonusGame;

public class BasicGame {
    private static BonusGame bonusGame;
    public static void startBasicGame (double money){
        if (Math.random() <= Settings.CHANCE_TO_WIN_BONUS_ROUND) {
            System.out.println(Messages.USER_WON_BONUS_ROUND);
            bonusGame = new BonusGame();
            bonusGame.startBonusGame(money);
        }
        System.out.println(Messages.USER_MONEY + money);
    }
}
