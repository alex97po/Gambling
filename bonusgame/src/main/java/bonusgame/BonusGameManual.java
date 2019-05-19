package bonusgame;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Bonus Game with scanner and user's input
 * Can be used for testing and statistic gathering
 * User chose bonus boxes himself
 */
public class BonusGameManual {
    public static double startBonusGame(double userMoney) {
        System.out.println(Messages.USER_WON_BONUS_ROUND);
        HashMap<Integer, Boolean> blackBoxes = BlackBoxes.initiateBoxes();
        System.out.println(Messages.CHOOSE_BOX);
        Scanner scanner = new Scanner(System.in);
        BlackBoxesValidation.validateCorrectInput(scanner);
        int userChoice = scanner.nextInt();
        int result = BlackBoxesValidation.validateUserHasNotChosenSameBox(scanner, userChoice, blackBoxes);
        boolean flag = blackBoxes.get(result);
        while (flag) {
            System.out.println(Messages.MONEY_BOX);
            userMoney = userMoney + Settings.NUMBER_OF_COINS_IN_BOX;
            System.out.println(Messages.USER_MONEY + userMoney);
            blackBoxes.remove(result);
            System.out.println(Messages.CHOOSE_BOX);
            BlackBoxesValidation.validateCorrectInput(scanner);
            userChoice = scanner.nextInt();
            result = BlackBoxesValidation.validateUserHasNotChosenSameBox(scanner, userChoice, blackBoxes);
            flag = blackBoxes.get(result);
        }
        System.out.println(Messages.EMPTY_BOX);
        return userMoney;
    }
}
