package seedu.itlogger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static seedu.itlogger.Parser.parseDeadline;
import static seedu.itlogger.Parser.parseOwner;
import static seedu.itlogger.Parser.parseSeverity;
import static seedu.itlogger.Parser.parseStatus;
import static seedu.itlogger.Parser.parseTitle;

public class DefectTest {

    String input;
    Defect defect;

    @BeforeEach
    public void defectTestSetup() throws ParseException {
        input = "ADD t/Test s/New sv/1 dl/20-10-2020 o/Tester";
        defect = new Defect(parseTitle(input), parseStatus(input),
                parseSeverity(input), parseDeadline(input), parseOwner(input));
    }

    @Test
    public void printingDefectTest() {
        // Todo -> Write Test Here
    }
}
