package seedu.itlogger;

import java.util.Vector;

public class IssueList {

    private Vector issueList;

    public IssueList() {
        issueList = new Vector();
    }

    public Vector getIssue() {
        return issueList;
    }

    public void addIssue(Defect defect) {
        issueList.add(defect);
    }

    public void deleteIssue(int index) {
        issueList.remove(index);
    }
}
