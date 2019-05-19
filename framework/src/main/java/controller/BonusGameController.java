package controller;

import entity.BonusGame;

import java.util.Scanner;

/**
 * Type of controller to proceed Bonus Game
 */
public class BonusGameController implements Controller {
    public void launchGame(double money) {
        BonusGame bonusGame = new BonusGame(money);
        System.out.println(Message.MAKE_BET);
        Scanner scanner = new Scanner(System.in);
        boolean flag = scanner.hasNextLine();
        while (flag){
            bonusGame.makeBet();
            System.out.println(Message.MAKE_BET);
            scanner.nextLine();
            flag = scanner.hasNextLine();
        }

    }
}
