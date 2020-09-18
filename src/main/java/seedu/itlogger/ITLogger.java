package seedu.itlogger;

import static seedu.itlogger.InputHandler.getInput;
import static seedu.itlogger.Interface.*;
import static seedu.itlogger.KeyWord.*;

public class ITLogger {
    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) {

        IssueList issueList = new IssueList();
        Parser parser = new Parser();

        printLogo();
        askName();
        String userName = getInput();
        greeter(userName);

        while(true){

            ProgramOpening();
            String input = getInput();

            //todo -> build PARSER

            String placeHolder = "";
            switch(KeyWord.valueOf(placeHolder)){
                case ADD: // Jian Cheng
                    // todo -> add Defect
                    break;

                case VIEW: // Shi Jie
                    // todo -> view ONE Defect with INDEX NUMBER
                    break;

                case DELETE: // Jang
                    // todo -> delete ONE Defect using INDEX NUMBER
                    break;

                case LIST:  // Jun Wen
                    // todo -> list ALL avaliable Defect in Issue List
                    break;

                default:
            }

        }
    }

}
