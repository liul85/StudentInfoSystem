package com.liul85.learn;

import com.liu85.learn.CourseSession;
import com.liu85.learn.Student;

import java.util.Date;

import static com.liul85.learn.DateUtil.createDate;

/**
 * Created by twcn on 3/4/16.
 */
public class CourseSessionTest extends junit.framework.TestCase {

    public static final int CREDITS = 3;
    private CourseSession session;
    private Date startDate;

    @Override
    public void setUp() throws Exception {
        startDate = createDate(2003, 1, 6);
        session = CourseSession.create("ENGL", "101", startDate);
        session.setNumberOfCredits(CREDITS);
    }

    public void testCreate() throws Exception {
        assertEquals("ENGL", session.getSessionDepartment());
        assertEquals("101", session.getSessionNumber());
        assertEquals(0, session.getNumberOfStudent());
    }

    public void testEnrollStudents() throws Exception {
        Student student1 = new Student("Cain Divoe");
        session.enroll(student1);
        assertEquals(CREDITS, student1.getCredits());

        assertEquals(1, session.getNumberOfStudent());
        assertEquals(student1, session.getStudent(0));

        Student student2 = new Student("James");
        session.enroll(student2);

        assertEquals(2, session.getNumberOfStudent());
        assertEquals(student2, session.getStudent(1));
        assertEquals(CREDITS, student2.getCredits());
    }

    public void testCourseDate() throws Exception {
        Date sixteenWeekOut = createDate(2003, 4, 25);
        assertEquals(sixteenWeekOut, session.getEndDate());
    }

    public void testCount() throws Exception {
        CourseSession.resetCount();
        createCourseSession();
        assertEquals(1, CourseSession.getCount());
        createCourseSession();
        assertEquals(2, CourseSession.getCount());

    }

    private CourseSession createCourseSession() {
        return CourseSession.create("ENGL", "101", startDate);
    }
}
