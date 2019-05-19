package controller;

import entity.SlotGame;

import java.util.Scanner;

/**
 * Type of controller to proceed Slot Game
 */
public class SlotGameController implements Controller {
    public void launchGame(double money) {
        SlotGame slotGame = new SlotGame(money);
        System.out.println(Message.MAKE_BET);
        Scanner scanner = new Scanner(System.in);
        boolean flag = scanner.hasNextLine();
        while (flag){
            slotGame.makeBet();
            System.out.println(Message.MAKE_BET);
            scanner.nextLine();
            flag = scanner.hasNextLine();
        }
    }
}
