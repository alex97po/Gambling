package entity;

/**
 * Entity game contains variables money, won, bet that are changed while making bets
 */
public abstract class Game implements GameActions {
    private static double money;
    private static double won;
    private static double bet;

    public static double getWonAll() {
        return wonAll;
    }

    public static double getBetAll() {
        return betAll;
    }

    private static double wonAll;
    private static double betAll;
    protected double round;


    public Game (double money) {
        this.money = money;
        this.wonAll = 0;
        this.betAll = 0;
        this.won = 0;
        this.bet = 0;
    }

    public static double getMoney () {
        return money + wonAll - betAll;
    }

    public void makeBet () {
        round = Math.random();
        won = getWonMoney();
        bet = getBetMoney();
        wonAll += won;
        betAll += bet;
        displayStats();
    }

}
