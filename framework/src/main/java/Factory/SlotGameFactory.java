package Factory;

import Entity.Game;
import Entity.SlotGame;

public class SlotGameFactory implements GameFactory {
    public Game launchGame(double moneyStart) {
        return new SlotGame(moneyStart);
    }
}
