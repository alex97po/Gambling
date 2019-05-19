package entity;
import slotgame.Messages;
import slotgame.Settings;

/**
 * In this type of game player can win coins or free spins
 */
public class SlotGame extends Game {
    public SlotGame (double money) {
        super(money);
    }

    public double getWonMoney () {
        return isWonRound() ? Settings.WON_COINS : 0;
    }

    public double getBetMoney () {
        return isFreeRound() ? 0 : Settings.BET_PRICE;
    }

    private boolean isWonRound () {
        return super.round <= Settings.CHANCE_TO_WIN_COINS;
    }

    private boolean isFreeRound () {
        return super.round <= Settings.CHANCE_TO_WIN_FREE_ROUND;
    }


    public void displayStats () {
        if (isFreeRound()){
            System.out.println(Messages.USER_WON_FREE_ROUND);
        }
        if (isWonRound()){
            System.out.println(Messages.USER_WON_MONEY);
        }
        System.out.println(Messages.USER_MONEY + " " + getMoney());
    }
}
