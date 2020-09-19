package seedu.itlogger;

public class Interface {
    private static String LOGO =  " ____        _        \n"
                                + "|  _ \\ _   _| | _____ \n"
                                + "| | | | | | | |/ / _ \\\n"
                                + "| |_| | |_| |   <  __/\n"
                                + "|____/ \\__,_|_|\\_\\___|\n";

    private static String ASK_NAME = "What is your name?";
    private static String GREEETING_MSG = "Hello ";
    private static String PROGRAM_OPENING = "What would you like to do?";

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

}
