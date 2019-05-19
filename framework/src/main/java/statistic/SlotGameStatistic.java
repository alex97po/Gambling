package statistic;

import entity.SlotGame;

/**
 * Class to imitate 1 000 000 bets of the game
 */
public class SlotGameStatistic {
    public void launchGame(double money) {
        SlotGame slotGame = new SlotGame(money);
        for (int i = 1; i <= 1000000; i++){
            slotGame.makeBet();
        }
        System.out.println("User has lost coins: " + slotGame.getBetAll());
        System.out.println("User has won coins: " + slotGame.getWonAll());
        double rtp = slotGame.getWonAll() / slotGame.getBetAll();
        System.out.println("RTP of a slotgame is: " + rtp);
    }
}
