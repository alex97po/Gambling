public class Main {
    public static void main(String[] args) {
        Round round = new Round(Settings.COINS_AMOUNT);
        for (int i = 0; i<1000000; i++) {
            round.bet();
        }
        double totalWin = round.moneyWon;
        double totalBet = round.moneySpent;
        double RTP = totalWin / totalBet * 100;
        System.out.println(round.moneySpent);
        System.out.println(round.moneyWon);
        System.out.println(RTP);
    }
}
