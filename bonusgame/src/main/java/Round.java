import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Round {
    //TO DO logs
    private static int money;
    public static int moneySpent;
    public static int moneyWon;

    public Round (int money) {
        this.money = money;
    }

    public static boolean validateUserHasEnoughMoney (int userMoney) {
        if (userMoney< Settings.BET_PRICE) {
            System.out.println(Messages.LACK_OF_MONEY);
            return false;
        }else
            return true;
    }

    public static void bet () {
        if (validateUserHasEnoughMoney(money)) {
            money = money - Settings.BET_PRICE;
            moneySpent+= Settings.BET_PRICE;
            if (Math.random() <= Settings.CHANCE_TO_WIN_BONUS_ROUND) {
                System.out.println(Messages.USER_WON_BONUS_ROUND);
                bonusGame(money, initiateBoxes());
            }
            System.out.println(Messages.USER_MONEY + money);
        }
    }

    public static HashMap initiateBoxes () {
        HashMap <Integer, Boolean> blackBoxes = new HashMap<Integer, Boolean>();
        for (int i = 1; i<= Settings.NUMBER_OF_BOXES; i++) {
            blackBoxes.put(i, true);
        }
        Random rand = new Random();
        blackBoxes.put(rand.nextInt(Settings.NUMBER_OF_BOXES)+1, false);
        return blackBoxes;
    }

    public static void bonusGame (int userMoney, HashMap <Integer, Boolean> blackBoxes) {
        System.out.println(Messages.CHOOSE_BOX);
        Scanner scanner = new Scanner(System.in);
        //validation
        boolean flagInt = scanner.hasNextInt();
        while (!flagInt){
            System.out.println(Messages.WRONG_NUMBER);
            System.out.println(Messages.CHOOSE_BOX);
            String scan = scanner.next();
            flagInt = scanner.hasNextInt();
        }
        int userChoice = scanner.nextInt();
        while(!blackBoxes.containsKey(userChoice)){
            System.out.println(Messages.WRONG_NUMBER);
            System.out.println(Messages.CHOOSE_BOX);
            userChoice = scanner.nextInt();
        }


        boolean flag = blackBoxes.get(userChoice);
        while (flag) {
            System.out.println(blackBoxes);
            System.out.println(Messages.MONEY_BOX);
            userMoney = userMoney + Settings.NUMBER_OF_COINS_IN_BOX;
            moneyWon+= Settings.NUMBER_OF_COINS_IN_BOX;
            System.out.println(Messages.USER_MONEY + userMoney);
            blackBoxes.remove(userChoice);
            System.out.println(Messages.CHOOSE_BOX);
            flagInt = scanner.hasNextInt();
            while (!flagInt){
                System.out.println(Messages.WRONG_NUMBER);
                System.out.println(Messages.CHOOSE_BOX);
                String scan = scanner.next();
                flagInt = scanner.hasNextInt();
            }
            userChoice = scanner.nextInt();
            while(!blackBoxes.containsKey(userChoice)){
                System.out.println(Messages.WRONG_NUMBER);
                System.out.println(Messages.CHOOSE_BOX);
                userChoice = scanner.nextInt();
            }
            flag = blackBoxes.get(userChoice);
        }
        System.out.println(Messages.EMPTY_BOX);
    }
}
