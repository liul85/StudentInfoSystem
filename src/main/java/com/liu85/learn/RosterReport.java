package com.liu85.learn;

/**
 * Created by twcn on 3/5/16.
 */
public class RosterReport {

    static final String NEWLINE = System.getProperty("line.separator");
    public static final String ROSTER_REPORT_HEADER = "Header" + NEWLINE + "----" + NEWLINE;
    public static final String ROSTER_REPORT_FOOTER = NEWLINE + "# students = ";
    private CourseSession session;

    public RosterReport(CourseSession session) {
        this.session = session;
    }

    public String getRosterReport() {
        StringBuilder builder = new StringBuilder();

        builder.append(ROSTER_REPORT_HEADER);

        for (Student student : session.getAllStudents()) {
            builder.append(student.getName());
            builder.append(NEWLINE);
        }

        builder.append(ROSTER_REPORT_FOOTER + session.getAllStudents().size() + '\n');
        return builder.toString();
    }
}
