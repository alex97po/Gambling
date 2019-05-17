package Service;

public class MoneyValidation {
    public static boolean validateUserHasEnoughMoney (double userMoney, int betPrice) {
        if (userMoney< betPrice) {
            System.out.println(Message.LACK_OF_MONEY);
            return false;
        }else
            return true;
    }
}
