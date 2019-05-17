package Statistic;

import Entity.Game;

import java.util.Scanner;

public class StatisticProceeding {
    private  static  double moneyWon;
    private  static  double moneyLose;
    public static void gameStart (Game game) {
        for (int i = 1; i < 1000000; i++){
            double valueBeforeBet = game.getMoney();
            game.makeBet();
            double valueAfterBet = game.getMoney();
            if (valueAfterBet > valueBeforeBet) {
                moneyWon = moneyWon + (valueAfterBet - valueBeforeBet);
            } else moneyLose = moneyLose + (valueBeforeBet - valueAfterBet);
        }
        System.out.println("RTP = " + moneyWon / moneyLose * 100);
    }
}
