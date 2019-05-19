package entity;

import org.junit.Assert;
import org.junit.Test;
import slotgame.Settings;

public class SlotGameTest {
    SlotGame slotGame = new SlotGame(1000);

    @Test
    public void getWonMoney() {
        slotGame.round = 0;
        Assert.assertEquals(Settings.WON_COINS, slotGame.getWonMoney(), 1E-7);
        slotGame.round = 1;
        Assert.assertEquals(0, slotGame.getWonMoney(), 1E-7);
    }

    @Test
    public void getBetMoney() {
        slotGame.round = 0;
        Assert.assertEquals(0, slotGame.getBetMoney(), 1E-7);
        slotGame.round = 1;
        Assert.assertEquals(Settings.BET_PRICE, slotGame.getBetMoney(), 1E-7);
    }
}