package statistic;

import java.io.IOException;

/**
 * Class launch and gathers statistics
 */
public class StatisticMain {
    public static void main(String[] args) throws IOException {
        SlotGameStatistic slotGameStatistic = new SlotGameStatistic();
        slotGameStatistic.launchGame(1000000);
        BonusGameStatistic bonusGameStatistic = new BonusGameStatistic();
        bonusGameStatistic.launchGame(1000000);
    }
}
