package seedu.itlogger;

import java.util.Scanner;

public class InputHandler {
    private static Scanner inputStream = new Scanner(System.in);

    public static String getInput() {
        return inputStream.nextLine();
    }

    public static boolean hasNextLine() {
        return inputStream.hasNextLine();
    }
}
