package bonusgame;

import java.util.HashMap;
import java.util.Scanner;

/**
 * If customer use manual type, methods of this class validate input data
 * Input data means number of int type and one which has not been used earlier
 */
public class BlackBoxesValidation {
    public static void validateCorrectInput (Scanner scanner) {
        boolean flagInt = scanner.hasNextInt();
        while (!flagInt){
            System.out.println(Messages.WRONG_NUMBER);
            System.out.println(Messages.CHOOSE_BOX);
            flagInt = scanner.hasNextInt();
        }
    }

    public static int validateUserHasNotChosenSameBox (Scanner scanner, int input, HashMap hashMap) {
        while(!hashMap.containsKey(input)){
            System.out.println(Messages.WRONG_NUMBER);
            System.out.println(Messages.CHOOSE_BOX);
            validateCorrectInput(scanner);
            input = scanner.nextInt();
        }
        return input;
    }

    }
