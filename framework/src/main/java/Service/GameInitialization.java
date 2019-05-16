package Service;

import Entity.Player;
import Factory.BonusGameFacroty;
import Factory.GameFactory;
import Factory.SlotGameFactory;

import java.util.Scanner;

public class GameInitialization {
    static GameFactory gameFactory;
    static Player player;
    public static void gameInit () {
        player = new Player();
        System.out.println(Message.WELCOME);
        System.out.println(Message.CHOOSE_GAME);
        System.out.println(Message.SLOTGAME);
        System.out.println(Message.BONUSGAME);
        Scanner scanner = new Scanner(System.in);
        InputValidation.gameChoose(scanner);
        if (scanner.nextInt() == 1) {
           gameFactory = new SlotGameFactory();
           gameFactory.launchGame(player.getMoneyAmount());
        }else {
            gameFactory = new BonusGameFacroty();
            gameFactory.launchGame(player.getMoneyAmount());
        }
    }
}
