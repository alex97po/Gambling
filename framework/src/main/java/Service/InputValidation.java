package Service;

import java.util.Scanner;

public class InputValidation {
    public static void gameChoose (Scanner scanner) {
        validation(scanner);
        while (scanner.nextInt()!=1 || scanner.nextInt() != 2) {
            System.out.println(Message.WRONG_NUMBER);
            String scan = scanner.next();
            validation(scanner);
        }
    }

    public static boolean validation (Scanner scanner) {
        boolean flagInt = scanner.hasNextInt();
        while (!flagInt) {
            System.out.println(Message.WRONG_NUMBER);
            String scan = scanner.next();
            flagInt = scanner.hasNextInt();
        }
        return flagInt;
    }
}
