package com.liu85.learn;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by twcn on 3/4/16.
 */
public class CourseSession {

    private Date startDate;
    private String department;
    private String number;
    private ArrayList<Student> allStudents = new ArrayList<Student>();

    public CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.startDate = startDate;
    }

    public String getSessionDepartment() {
        return department;
    }

    public String getSessionNumber() {
        return number;
    }

    public int getNumberOfStudent() {
        return allStudents.size();
    }

    public void enroll(Student student) {
        allStudents.add(student);
    }

    public Student getStudent(int i) {
        return allStudents.get(i);
    }


    public Date getEndDate() {
        final int sessionLength = 16;
        final int daysInWeek = 7;
        final int dayFromFridayToMonday = 3;
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        int numberOfDay = sessionLength * daysInWeek - dayFromFridayToMonday;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDay);
        return calendar.getTime();
    }

    ArrayList<Student> getAllStudents() {
        return allStudents;
    }

}
