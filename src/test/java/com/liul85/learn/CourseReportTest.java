package com.liul85.learn;

import com.liu85.learn.CourseReport;
import com.liu85.learn.CourseSession;
import junit.framework.TestCase;

import java.util.Date;

/**
 * Created by twcn on 3/8/16.
 */
public class CourseReportTest extends TestCase {
    private static final String NEWLINE = "\n";

    public void testReport() throws Exception {
        final Date date = new Date();
        CourseReport report = new CourseReport();
        report.add(CourseSession.create("CZEC", "220", date));
        report.add(CourseSession.create("ENGL", "101", date));
        report.add(CourseSession.create("CZEC", "200", date));
        report.add(CourseSession.create("ITAL", "401", date));
        report.add(CourseSession.create("ITAL", "330", date));

        assertEquals("CZEC 200" + NEWLINE +
                    "CZEC 220" + NEWLINE +
                    "ENGL 101" + NEWLINE +
                    "ITAL 330" + NEWLINE +
                    "ITAL 401" + NEWLINE,
                    report.text());
    }
}
