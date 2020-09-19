package seedu.itlogger;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Defect {
    String title;
    String status;
    int severity;
    Date dateRaised;
    Date deadline;
    String owner;

    public Defect(String title, String status, int severity, Date deadline, String owner) {
        this.title = title;
        this.status = status;
        this.severity = severity;
        this.dateRaised = Date.from(Instant.now());
        this.deadline = deadline;
        this.owner = owner;
    }

    /**
     * toString method will convert Defect object into String
     * to print out.
     * @return String to print out for this Defect
     */
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy");
        return "Title: " + title + System.lineSeparator()
                + "Status: " + status + System.lineSeparator()
                + "Severity: Level " + severity + System.lineSeparator()
                + "Date Raised: " + dateFormat.format(dateRaised) + System.lineSeparator()
                + "Deadline: " + dateFormat.format(deadline) + System.lineSeparator()
                + "Owner: " + owner;
    }

}
