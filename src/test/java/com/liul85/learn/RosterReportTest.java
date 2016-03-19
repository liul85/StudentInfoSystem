package com.liul85.learn;

import com.liu85.learn.CourseSession;
import com.liu85.learn.RosterReport;
import com.liu85.learn.Student;
import junit.framework.TestCase;

import static com.liu85.learn.RosterReport.ROSTER_REPORT_FOOTER;
import static com.liu85.learn.RosterReport.ROSTER_REPORT_HEADER;

/**
 * Created by twcn on 3/5/16.
 */
public class RosterReportTest extends TestCase {
    public void testRosterReport() throws Exception {
        CourseSession session = CourseSession.create("ENGL", "101", DateUtil.createDate(2003, 1, 6));

        session.enroll(new Student("A"));
        session.enroll(new Student("B"));

        RosterReport rosterReport = new RosterReport(session);

        assertEquals(ROSTER_REPORT_HEADER +
                "A\nB\n" +
                ROSTER_REPORT_FOOTER + "2\n", rosterReport.getRosterReport());
    }
}
