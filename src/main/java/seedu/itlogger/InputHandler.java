package seedu.itlogger;

import java.util.Scanner;

public class InputHandler {
    static private Scanner inputStream = new Scanner(System.in);

    static public String getInput(){
        return inputStream.nextLine();
    }
}
