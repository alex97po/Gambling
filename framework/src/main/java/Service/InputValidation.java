package Service;

import java.util.Scanner;

public class InputValidation {
    public static int gameChoose (Scanner scanner) {
        int number;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println(Message.WRONG_NUMBER);
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number < 1 || number > 2);
        return number;
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
