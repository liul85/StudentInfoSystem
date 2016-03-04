package com.liul85.learn;

/**
 * Created by twcn on 3/4/16.
 */
public class AllTests {
    public static junit.framework.TestSuite suite() {
        junit.framework.TestSuite suit = new junit.framework.TestSuite();
        suit.addTestSuite(CourseSessionTest.class);
        suit.addTestSuite(StudentTest.class);
        return suit;
    }
}
