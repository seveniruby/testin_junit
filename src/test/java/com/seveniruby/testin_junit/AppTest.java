package com.seveniruby.testin_junit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void test_1()
    {
        App a=new App();
        int c=a.add(1, 2);
        assertEquals(3, c);
    }
    public void test_2()
    {
        App a=new App();
        int c=a.add(1, 3);
        assertEquals(4, c);
    }
    public void test_3()
    {
        App a=new App();
        int c=a.add(1, -2);
        assertEquals(-1, c);
    }
    public void test_4()
    {
        App a=new App();
        int c=a.add(0, 0);
        assertEquals(2, c);
    }
    public void test_5()
    {
        App a=new App();
        int c=a.add(1, 100);
        assertEquals(3, c);
    }
    public void test_6()
    {
        App a=new App();
        int c=a.add(1, 1000);
        assertEquals(3, c);
    }
}
