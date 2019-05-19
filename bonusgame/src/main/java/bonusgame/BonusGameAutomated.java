package bonusgame;

import java.util.HashMap;
import java.util.Random;

/**
 * Bonus Game without scanner and user's input
 * Can be used for testing and statistic gathering
 */
public class BonusGameAutomated {
    public static double startBonusGame(double userMoney) {
        System.out.println(Messages.USER_WON_BONUS_ROUND);
        HashMap <Integer, Boolean> blackBoxes = BlackBoxes.initiateBoxes();
        System.out.println(Messages.CHOOSE_BOX);
        int userChoice;
        userChoice = getRandomBox();
        boolean flag = blackBoxes.get(userChoice);
        while (flag) {
            System.out.println(Messages.MONEY_BOX);
            userMoney = userMoney + Settings.NUMBER_OF_COINS_IN_BOX;
            System.out.println(Messages.USER_MONEY + userMoney);
            blackBoxes.remove(userChoice);
            System.out.println(Messages.CHOOSE_BOX);
            while (!blackBoxes.containsKey(userChoice)) {
                userChoice = getRandomBox();
            }
            flag = blackBoxes.get(userChoice);
        }
        System.out.println(Messages.EMPTY_BOX);
        return userMoney;
    }

    private static int getRandomBox () {
        Random rand = new Random();
        return rand.nextInt(Settings.NUMBER_OF_BOXES)+1;
    }
}