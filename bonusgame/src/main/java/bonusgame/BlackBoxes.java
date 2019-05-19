package bonusgame;

import java.util.HashMap;
import java.util.Random;

/**
 * This class is responsible for creating boxes with money
 * One random box is empty
 */
public class BlackBoxes {
    public static HashMap initiateBoxes () {
        HashMap <Integer, Boolean> blackBoxes = new HashMap<Integer, Boolean>();
        for (int i = 1; i<= Settings.NUMBER_OF_BOXES; i++) {
            blackBoxes.put(i, true);
        }
        Random rand = new Random();
        blackBoxes.put(rand.nextInt(Settings.NUMBER_OF_BOXES)+1, false);
        return blackBoxes;
    }
}
