package statistic;

import entity.BonusGame;

/**
 * Class to imitate 1 000 000 bets of the game
 */
public class BonusGameStatistic {
    public void launchGame(double money) {
        BonusGame bonusGame = new BonusGame(money);
        for (int i = 1; i <= 1000000; i++){
            bonusGame.makeBet();
        }
        System.out.println("User has lost coins: " + bonusGame.getBetAll());
        System.out.println("User has won coins: " + bonusGame.getWonAll());
        double rtp = bonusGame.getWonAll() / bonusGame.getBetAll();
        System.out.println("RTP of a bonusgame is: " + rtp);
    }
}
