package seedu.itlogger;

public class Interface {
    static private String LOGO =  " ____        _        \n"
                                + "|  _ \\ _   _| | _____ \n"
                                + "| | | | | | | |/ / _ \\\n"
                                + "| |_| | |_| |   <  __/\n"
                                + "|____/ \\__,_|_|\\_\\___|\n";

    static private String ASK_NAME = "What is your name?";
    static private String GREEETING_MSG = "Hello ";
    static private String PROGRAM_OPENING = "What would you like to do?";

    static public void printLogo(){
        System.out.println(LOGO);
    }

    static public void askName(){
        System.out.println(ASK_NAME);
    }

    static public void greeter(String name){
        System.out.println(GREEETING_MSG + name);
    }

    static public void ProgramOpening(){
        System.out.println(PROGRAM_OPENING);
    }

}
