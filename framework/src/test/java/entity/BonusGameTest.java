package entity;

import bonusgame.Settings;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BonusGameTest {
    BonusGame bonusGame = new BonusGame(1000);

    @Test
    public void getWonMoney() {
        bonusGame.round = 1;
        Assert.assertEquals(0, bonusGame.getWonMoney(), 1E-7);
    }

    @Test
    public void getBetMoney() {
        bonusGame.round = 0;
        Assert.assertEquals(0, bonusGame.getBetMoney(), 1E-7);
        bonusGame.round = 1;
        Assert.assertEquals(Settings.BET_PRICE, bonusGame.getBetMoney(), 1E-7);
    }
}