package seedu.itlogger;

import java.util.Vector;

public class IssueList {

    private Vector<Defect> issueList;

    public IssueList() {
        issueList = new Vector<>();
    }

    public Vector<Defect> getIssue() {
        return issueList;
    }

    public void addIssue(Defect defect) {
        issueList.add(defect);
    }

    public void deleteIssue(int index) {
        issueList.remove(index);
    }
}
