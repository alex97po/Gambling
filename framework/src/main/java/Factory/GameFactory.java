package Factory;

import Entity.Game;

public interface GameFactory {
    Game launchGame(double moneyStart);
}
