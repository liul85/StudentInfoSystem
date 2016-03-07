package com.liu85.learn;

import com.sun.corba.se.impl.protocol.INSServerRequestDispatcher;

/**
 * Created by twcn on 3/2/16.
 */
public class Student {
    public static final int CREDITS_REQUIRED_FULL_TIME = 12;
    public static final String IN_STATE = "MO";
    private final String name;
    private boolean fullTime = false;
    private int credits;
    private boolean inState = false;
    private String state = "";

    public Student(String name) {
        this.name = name;
        credits = 0;
    }

    public String getName() {
        return name;
    }

    public boolean isFullTime() {
        return credits >= CREDITS_REQUIRED_FULL_TIME;
    }

    public int getCredits() {
        return credits;
    }

    public void addCredits(int credits) {
        this.credits += credits;
    }

    public boolean isInState() {
        return IN_STATE.equals(state.toUpperCase());
    }

    public void setState(String state) {
        this.state = state;
    }
}
