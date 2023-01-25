package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuValidator {
    public static <T extends Enum<T>> void menu(Class<T> enumType) {
        System.out.println("Please select an option:");
        T[] options = enumType.getEnumConstants();
        for (int i = 0; i < options.length; i++) {
            T option = options[i];
            System.out.println((i + 1) + ". " + option.toString());
        }
    }

    public static <T extends Enum<T>> T getValidMenuOption(Scanner sc, Class<T> enumType) {
        menu(enumType);
        int choice = -1;
        while (choice < 1 || choice > enumType.getEnumConstants().length) {
            choice = -1;
            System.out.print("Enter your choice: ");
            try {
                choice = sc.nextInt();
                if (choice < 1 || choice > enumType.getEnumConstants().length) {
                    System.out.println("Invalid choice, please enter a number between 1 and " + enumType.getEnumConstants().length);
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice, please enter a number between 1 and " + enumType.getEnumConstants().length);
                sc.nextLine();
                continue;
            }
        }
        return enumType.getEnumConstants()[choice - 1];
    }

}
