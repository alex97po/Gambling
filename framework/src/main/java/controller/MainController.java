package controller;

import java.util.Scanner;

/**
 * Class is responsible for further proceeding of one of the games
 * Handles exception in case of incorrect input
 */
public class MainController {
    public Controller userChooseGameToPlay () {
        showInitMenu();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        try {switch (Integer.parseInt(input)) {
                case (1):
                    System.out.println(Message.SLOTGAME_CHOSEN);
                    return new SlotGameController();
                case (2):
                    System.out.println(Message.BONUSGAME_CHOSEN);
                    return new BonusGameController();
                case (0):
                    System.exit(1);
                default:
                    System.out.println(Message.WRONG_NUMBER);
            }
        }catch (NumberFormatException e) {
            System.out.println(Message.WRONG_NUMBER);
        }
        return null;
    }

    private static void showInitMenu () {
        System.out.println(Message.WELCOME);
        System.out.println(Message.CHOOSE_GAME);
        System.out.println(Message.SLOTGAME);
        System.out.println(Message.BONUSGAME);
        System.out.println(Message.EXIT);
    }

}
