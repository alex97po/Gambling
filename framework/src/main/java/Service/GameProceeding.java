package Service;

import Entity.Game;

public class GameProceeding {
    public static void gameStart (Game game) {
        MoneyValidation moneyValidation = new MoneyValidation();
        while (moneyValidation.validateUserHasEnoughMoney(game.getMoney(),10)) {
            game.makeBet();
        }
    }
}
