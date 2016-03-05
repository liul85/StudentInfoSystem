package com.liul85.learn;

import com.liu85.learn.CourseSession;
import com.liu85.learn.RosterReport;
import com.liu85.learn.Student;

/**
 * Created by twcn on 3/5/16.
 */
public class RosterReportTest extends junit.framework.TestCase {
    public void testRosterReport() throws Exception {
        CourseSession session = new CourseSession("ENGL", "101", DateUtil.createDate(2003, 1, 6));

        session.enroll(new Student("A"));
        session.enroll(new Student("B"));

        RosterReport rosterReport = new RosterReport(session);

        assertEquals(rosterReport.ROSTER_REPORT_HEADER +
                "A\nB\n" +
                rosterReport.ROSTER_REPORT_FOOTER + "2\n", rosterReport.getRosterReport());
    }

}
