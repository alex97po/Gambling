package Factory;

import Entity.BonusGame;
import Entity.Game;

public class BonusGameFacroty implements GameFactory {
    public Game launchGame(double moneyStart) {
        return new BonusGame(moneyStart);
    }
}
