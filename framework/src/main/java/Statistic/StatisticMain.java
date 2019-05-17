package Statistic;

import Entity.Game;
import Service.GameInitialization;

public class StatisticMain {
    public static void main(String[] args) {
        GameInitialization gameInitialization = new GameInitialization();
        Game currentGame = gameInitialization.gameInit();
        StatisticProceeding statisticProceeding = new StatisticProceeding();
        statisticProceeding.gameStart(currentGame);
    }
}
