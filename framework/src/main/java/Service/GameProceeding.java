package Service;

import Entity.Game;


public class GameProceeding {
    public static void gameStart (Game game) {
        while (true) {
            game.makeBet();
        }
    }
}
