package seedu.itlogger;

import java.util.Iterator;
import java.util.Vector;

public class Interface {
    private static String LOGO =  " ____        _\n"
                                + "|  _ \\ _   _| | _____ \n"
                                + "| | | | | | | |/ / _ \\\n"
                                + "| |_| | |_| |   <  __/\n"
                                + "|____/ \\__,_|_|\\_\\___|\n";

    private static String ASK_NAME = "What is your name?";
    private static String GREEETING_MSG = "Hello ";
    private static String PROGRAM_OPENING = "What would you like to do?";
    private static String EMPTY_ERROR_MSG = "There are no items now";
    private static String KEYWORD_ISSUE = "Keyword does not exists";

    public static void printLogo() {
        System.out.println(LOGO);
    }

    public static void askName() {
        System.out.println(ASK_NAME);
    }

    public static void greeter(String name) {
        System.out.println(GREEETING_MSG + name);
    }

    public static void programOpening() {
        System.out.println(PROGRAM_OPENING);
    }

    public static void keyWordIssue() {
        System.out.println(KEYWORD_ISSUE);
    }

    public static void displayIssues(Vector toBeDisplayed) {
        Iterator iter = toBeDisplayed.iterator();
        while (iter.hasNext()) {
            Defect issue = (Defect) iter.next();
            System.out.println(issue + System.lineSeparator());
        }
    }

    public static void emptyErrorMsg() {
        System.out.println(EMPTY_ERROR_MSG);
    }
}
