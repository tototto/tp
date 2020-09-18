package seedu.itlogger;

import java.util.Date;

public class Defect {
    String title;
    String status;
    int severity;
    Date dateRaised;
    Date deadline;
    String owner;

    public Defect(String title, String status, int severity, Date dateRaised, Date deadline, String owner){
        this.title = title;
        this.status = status;
        this.severity = severity;
        this.dateRaised = dateRaised;
        this.deadline = deadline;
        this.owner = owner ;
    }

}
