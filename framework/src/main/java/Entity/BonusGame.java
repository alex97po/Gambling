package Entity;
import static BonusGame.BasicGame.startBasicGame;

public class BonusGame extends Game{

    public BonusGame(double money) {
        super(money);
    }
    @Override
    public void makeBet() {
        double updateMoney = startBasicGame(getMoney());
        setMoney(updateMoney);
    }
}
