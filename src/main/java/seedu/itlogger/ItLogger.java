package seedu.itlogger;

import java.text.ParseException;

import static seedu.itlogger.InputHandler.getInput;
import static seedu.itlogger.InputHandler.hasNextLine;
import static seedu.itlogger.Interface.greeter;
import static seedu.itlogger.Interface.printLogo;
import static seedu.itlogger.Interface.askName;
import static seedu.itlogger.Interface.programOpening;
import static seedu.itlogger.Parser.parseDeadline;
import static seedu.itlogger.Parser.parseIndex;
import static seedu.itlogger.Parser.parseKeyWord;
import static seedu.itlogger.Parser.parseOwner;
import static seedu.itlogger.Parser.parseSeverity;
import static seedu.itlogger.Parser.parseStatus;
import static seedu.itlogger.Parser.parseTitle;

public class ItLogger {
    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) {

        IssueList issueList = new IssueList();

        printLogo();
        askName();
        String userName = "";
        if (hasNextLine()) {
            userName = getInput();
        }
        greeter(userName);

        while (true) {

            programOpening();
            String input = "";
            if (hasNextLine()) {
                input = getInput();
            }
            //todo -> build PARSER

            //String placeHolder = "";
            switch (parseKeyWord(input)) {
            case ADD: // Jian Cheng
                // todo -> add Defect
                try {
                    Defect newIssue = new Defect(parseTitle(input), parseStatus(input),
                                        parseSeverity(input), parseDeadline(input), parseOwner(input));
                    //System.out.println(test.toString());
                    issueList.addIssue(newIssue);
                } catch (ParseException e) {
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
