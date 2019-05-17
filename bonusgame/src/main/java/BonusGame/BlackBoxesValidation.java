package BonusGame;

import java.util.HashMap;
import java.util.Scanner;

public class BlackBoxesValidation {
    public static void validateCorrectInput (Scanner scanner) {
        boolean flagInt = scanner.hasNextInt();
        while (!flagInt){
            System.out.println(Messages.WRONG_NUMBER);
            System.out.println(Messages.CHOOSE_BOX);
            String scan = scanner.next();
            flagInt = scanner.hasNextInt();
        }
    }

    public static void validateUserHasNotChosenSameBox (Scanner scanner, int input, HashMap hashMap) {
        while(!hashMap.containsKey(input)){
            System.out.println(Messages.WRONG_NUMBER);
            System.out.println(Messages.CHOOSE_BOX);
            validateCorrectInput(scanner);
            input = scanner.nextInt();
        }
    }

    }
