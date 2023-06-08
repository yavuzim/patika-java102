package PatikaStore;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static Scanner input = new Scanner(System.in);

    protected static int processInput(String message) {
        int selectedProcess = 0;
        try {
            selectedProcess = input(message);
        } catch (InputMismatchException e) {
            System.out.println("Geçersiz Değer Girişi.");
            Line.line(8, "-");
            input.nextLine();
            processInput(message);
        }
        return selectedProcess;
    }

    private static int input(String message) {
        System.out.print(message);
        return input.nextInt();
    }
}
