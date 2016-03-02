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
}
