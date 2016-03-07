package com.liul85.learn;

import com.liu85.learn.Student;

/**
 * Created by twcn on 3/2/16.
 */
public class StudentTest extends junit.framework.TestCase {
    public void testCreate() {
        final String name = "Jane Doe";
        Student student = new Student(name);
        String studentName = student.getName();

        assertEquals(name, studentName);
    }

    public void testFullTime() throws Exception {
        Student student = new Student("a");
        assertFalse(student.isFullTime());
    }

    public void testCredits() throws Exception {
        Student student = new Student("b");
        assertEquals(0, student.getCredits());

        student.addCredits(3);
        assertEquals(3, student.getCredits());

        student.addCredits(4);
        assertEquals(7, student.getCredits());

        student.addCredits(5);
        assertEquals(12, student.getCredits());
        assertTrue(student.isFullTime());
    }

    public void testInState() throws Exception {
        Student student = new Student("a");
        assertFalse(student.isInState());

        student.setState(Student.IN_STATE);
        assertTrue(student.isInState());

        student.setState("MD");
        assertFalse(student.isInState());
    }
}
