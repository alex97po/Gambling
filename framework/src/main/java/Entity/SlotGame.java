package Entity;
import static SlotGame.NormalBet.makeNormalBet;

public class SlotGame extends Game {
    public SlotGame(double money) {
        super(money);
    }

    @Override
    public void makeBet(){
        double updateMoney = makeNormalBet(getMoney());
        setMoney(updateMoney);
    }
}
