package com.insurgentgames.exterminoid.gui;

import junit.framework.TestSuite;

public class AllTestsGui extends TestSuite {

    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.setName("AllTestsGui");
        suite.addTestSuite(ScreenTest.class);
        return suite;
    }

}
