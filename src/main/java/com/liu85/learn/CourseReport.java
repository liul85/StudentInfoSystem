package com.liu85.learn;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by twcn on 3/8/16.
 */
public class CourseReport {
    private static final String NEWLINE = "\n";
    private ArrayList<CourseSession> sessions = new ArrayList<>();

    public void add(CourseSession session) {
        sessions.add(session);
    }

    public String text() {
        StringBuilder builder = new StringBuilder();
        Collections.sort(sessions);
        for (CourseSession session : sessions) {
            builder.append(session.getSessionDepartment() + " " +
            session.getSessionNumber() + NEWLINE);
        }

        return builder.toString();
    }
}
