package com.insurgentgames.exterminoid.test;

import junit.framework.TestSuite;

import com.insurgentgames.exterminoid.gui.AllTestsGui;

public class AllTests extends TestSuite {

    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(AllTestsGui.suite());
        return suite;
    }

}
