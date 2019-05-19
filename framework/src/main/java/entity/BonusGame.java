package entity;

import bonusgame.BonusGameAutomated;
import bonusgame.Messages;
import bonusgame.Settings;

/**
 * In this type of game player can win bonus game
 */
public class BonusGame extends Game {

    public BonusGame(double money) {
        super(money);
    }

    public double getWonMoney () {
        double beforeBonus = getMoney();
        return isBonusRound() ? BonusGameAutomated.startBonusGame(getMoney()) - beforeBonus : 0;
    }

    public double getBetMoney () {
        return isBonusRound() ? 0 : Settings.BET_PRICE;
    }

    private boolean isBonusRound () {
        return super.round <= Settings.CHANCE_TO_WIN_BONUS_ROUND;
    }

    public void displayStats() {
        System.out.println(Messages.USER_MONEY + " " + getMoney());
    }
}
