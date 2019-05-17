package Service;

import Entity.Game;
import Entity.Player;
import Factory.BonusGameFactory;
import Factory.GameFactory;
import Factory.SlotGameFactory;

import java.util.Scanner;

/**
 * Welcome new user and create instance of certain game user will play then
 */
public class GameInitialization {
    private static GameFactory gameFactory;
    private static Player player;
    public static Game gameInit () {
        player = new Player();
        System.out.println(Message.WELCOME);
        System.out.println(Message.CHOOSE_GAME);
        System.out.println(Message.SLOTGAME);
        System.out.println(Message.BONUSGAME);
        Scanner scanner = new Scanner(System.in);
        InputValidation.gameChoose(scanner);
        if (scanner.nextInt() == 1) {
           gameFactory = new SlotGameFactory();
           return gameFactory.launchGame(player.getMoneyAmount());
        }else {
            gameFactory = new BonusGameFactory();
            return gameFactory.launchGame(player.getMoneyAmount());
        }
    }
}
