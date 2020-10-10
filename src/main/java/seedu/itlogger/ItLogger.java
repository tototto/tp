package seedu.itlogger;

import java.text.ParseException;
import java.util.Vector;

import static seedu.itlogger.InputHandler.getInput;
import static seedu.itlogger.InputHandler.hasNextLine;
import static seedu.itlogger.Interface.*;
import static seedu.itlogger.Parser.*;

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
        boolean keepRun = true;
        while (keepRun) {

            programOpening();
            String input = "";
            if (hasNextLine()) {
                input = getInput();
            }
            KeyWord command = KeyWord.OTHERS;

            try {
                command = parseKeyWord(input.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            }
            //todo -> build PARSER

            //String placeHolder = "";
            switch (command) {
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
                try {
                    System.out.println(issueList.getDefect(parseIndex(input)).toString());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;

            case DELETE: // Jang
                // todo -> delete ONE Defect using INDEX NUMBER
                try {
                    issueList.deleteIssue(parseIndex(input));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;

            case LIST:  // Jun Wen
                // todo -> list ALL avaliable Defect in Issue List
                Vector toBeDisplayed = issueList.getIssue();
                displayIssues(toBeDisplayed);
                if (toBeDisplayed.size() == 0) {
                    emptyErrorMsg();
                }
                break;

            case EXIT:
                keepRun = false;
                break;

            default:
                System.out.println("Unknown KeyWord, please try again!");
                break;
            }

        }
    }

}
