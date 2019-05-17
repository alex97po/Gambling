package Entity;
import static BonusGame.BonusGame.startBonusGame;

public class BonusGame extends Game{

    public BonusGame(double money) {
        super(money);
    }
    @Override
    public void makeBet() {
        startBonusGame(getMoney());
    }
}
