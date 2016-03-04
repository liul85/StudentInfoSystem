package com.liul85.learn;

import com.liu85.learn.CourseSession;
import com.liu85.learn.Student;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by twcn on 3/4/16.
 */
public class CourseSessionTest extends junit.framework.TestCase {

    private CourseSession session;
    private Date startDate;

    private Date createDate(int year, int month, int day) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month -1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        return calendar.getTime();
    }

    @Override
    public void setUp() throws Exception {
        startDate = createDate(2003, 1, 6);
        session = new CourseSession("ENGL", "101", startDate);
    }

    public void testCreate() throws Exception {
        assertEquals("ENGL", session.getSessionDepartment());
        assertEquals("101", session.getSessionNumber());
        assertEquals(0, session.getNumberOfStudent());
    }

    public void testEnrollStudents() throws Exception {
        Student student1 = new Student("Cain Divoe");
        session.enroll(student1);

        assertEquals(1, session.getNumberOfStudent());
        assertEquals(student1, session.getStudent(0));


        Student student2 = new Student("James");
        session.enroll(student2);

        assertEquals(2, session.getNumberOfStudent());
        assertEquals(student2, session.getStudent(1));
    }

    public void testCourseDate() throws Exception {
        Date sixteenWeekOut = createDate(2003, 4, 25);
        assertEquals(sixteenWeekOut, session.getEndDate());
    }
}
