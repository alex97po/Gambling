package BonusGame;

import java.util.HashMap;
import java.util.Scanner;

public class BonusGame {
    private static BlackBoxes boxes;
    public static void startBonusGame(double userMoney) {
        boxes = new BlackBoxes();
        HashMap <Integer, Boolean> blackBoxes = boxes.initiateBoxes();
        System.out.println(Messages.CHOOSE_BOX);
        Scanner scanner = new Scanner(System.in);
        BlackBoxesValidation.validateCorrectInput(scanner);
        int userChoice = scanner.nextInt();
        BlackBoxesValidation.validateUserHasNotChosenSameBox(scanner, userChoice, blackBoxes);
        boolean flag = blackBoxes.get(userChoice);
        while (flag) {
            System.out.println(blackBoxes);
            System.out.println(Messages.MONEY_BOX);
            userMoney = userMoney + Settings.NUMBER_OF_COINS_IN_BOX;
            System.out.println(Messages.USER_MONEY + userMoney);
            blackBoxes.remove(userChoice);
            System.out.println(Messages.CHOOSE_BOX);
            BlackBoxesValidation.validateCorrectInput(scanner);
            userChoice = scanner.nextInt();
            BlackBoxesValidation.validateUserHasNotChosenSameBox(scanner, userChoice, blackBoxes);
            flag = blackBoxes.get(userChoice);
        }
        System.out.println(Messages.EMPTY_BOX);
    }
}