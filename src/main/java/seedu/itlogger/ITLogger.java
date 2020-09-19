package seedu.itlogger;

import java.text.ParseException;

import static seedu.itlogger.InputHandler.getInput;
import static seedu.itlogger.Interface.*;
import static seedu.itlogger.KeyWord.*;
import static seedu.itlogger.Parser.*;

public class ITLogger {
    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) {

        IssueList issueList = new IssueList();

        printLogo();
        askName();
        String userName = getInput();
        greeter(userName);

        while(true) {

            ProgramOpening();
            String input = getInput();
            //todo -> build PARSER

            //String placeHolder = "";
            switch(parseKeyWord(input)){
                case ADD: // Jian Cheng
                    // todo -> add Defect
                    try {
                        Defect newIssue = new Defect(parseTitle(input), parseStatus(input),
                                            parseSeverity(input), parseDeadline(input), parseOwner(input));
                        //System.out.println(test.toString());
                        issueList.addIssue(newIssue);
                    }catch(ParseException e){
                        System.out.println(e);
                    }

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
