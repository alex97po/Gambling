package Factory;

import Entity.BonusGame;
import Entity.Game;

public class BonusGameFactory implements GameFactory {
    public Game launchGame(double moneyStart) {
        return new BonusGame(moneyStart);
    }
}
