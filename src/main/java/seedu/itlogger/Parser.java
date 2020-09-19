package seedu.itlogger;

// Jian Cheng

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * This Parser Class handles the String input.
 * It will parse the string into respective output in
 * correct format and type.
 */
public class Parser {
    /**
     * parseKeyWord method will parse the fullInput
     * and get KeyWord from fullInput.
     * @param fullInput -> user's full command
     * @return keyword provided by user and in KeyWord enum
     */
    public static KeyWord parseKeyWord(String fullInput) throws IllegalArgumentException {
        String possibleKeyWord;
        if (fullInput.contains(" ")) {
            possibleKeyWord = fullInput.split(" ")[0];
        } else {
            possibleKeyWord = fullInput;
        }

        return KeyWord.valueOf(possibleKeyWord);
    }

    /**
     * parseInputElement method will parse the input given
     * and return the element as String that is between startNotation
     * and endNotation.
     * @param input -> input String to parse
     * @param startNotation -> notation to start the element
     * @param endNotation -> notation to end the element
     * @return element that is between start and end notation as String type
     */
    protected static String parseInputElement(String input, String startNotation, String endNotation) {
        int elementStartIndex = input.indexOf(startNotation) + startNotation.length();
        int elementEndIndex = input.indexOf(endNotation);
        return input.substring(elementStartIndex,elementEndIndex);
    }

    /**
     * parseTitle method will parse the fullInput
     * and return Title of Defect for ADD Command.
     * @param fullInput -> user's full command
     * @return Defect title provided by user and in String type
     */
    public static String parseTitle(String fullInput) {
        String titleStartNotation = "t/";
        String titleEndNotation = " s/";
        return parseInputElement(fullInput,titleStartNotation,titleEndNotation);
    }

    /**
     * parseStatus method will parse the fullInput
     * and return Status of Defect for ADD Command.
     * @param fullInput -> user's full command
     * @return Defect status provided by user and in String type
     */
    public static String parseStatus(String fullInput) {
        String statusStartNotation = "s/";
        String statusEndNotation = " sv/";
        return parseInputElement(fullInput,statusStartNotation,statusEndNotation);
    }

    /**
     * parseSeverity method will parse the fullInput
     * and return Severity of Defect for ADD Command.
     * @param fullInput -> user's full command
     * @return Defect severity provided by user and in int type
     */
    public static int parseSeverity(String fullInput) {
        String severityStartNotation = "sv/";
        String severityEndNotation = " dl/";
        String severity = parseInputElement(fullInput,severityStartNotation,severityEndNotation);
        return Integer.parseInt(severity);
    }

    /**
     * parseDeadline method will parse the fullInput
     * and return Deadline of Defect for ADD Command.
     * @param fullInput -> user's full command
     * @return Defect deadline provided by user and in Date type
     */
    public static Date parseDeadline(String fullInput) throws ParseException {
        String deadlineStartNotation = "dl/";
        String deadlineEndNotation = " o/";
        String deadline = parseInputElement(fullInput,deadlineStartNotation, deadlineEndNotation);
        return new SimpleDateFormat("dd-MM-yyyy").parse(deadline);
    }

    /**
     * parseOwner method will parse the fullInput
     * and return Owner of Defect for ADD Command.
     * @param fullInput -> user's full command
     * @return Defect owner provided by user and in String type
     */
    public static String parseOwner(String fullInput) {
        int ownerStartIndex = fullInput.indexOf("o/") + 2;
        return fullInput.substring(ownerStartIndex);
    }

    /**
     * parseIndex method will parse the fullInput and return
     * user indicated index for VIEW and DELETE Command.
     * @param fullInput -> user's full command
     * @return Defect index provided by user and in int type
     */
    public static int parseIndex(String fullInput) {
        String possibleIndex = fullInput.split("/")[1];
        return Integer.parseInt(possibleIndex);
    }
}
