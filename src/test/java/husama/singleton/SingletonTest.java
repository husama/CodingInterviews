package husama.singleton;

import husama.singleton.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by hu on 2017/3/6.
 */
public class SingletonTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SingletonTest( String testName ) {

        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(SingletonTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testSingleton1() {
        Singleton1 singleton1 = Singleton1.getInstance();
        assertNotNull(singleton1);
        Singleton1 singleton1_1 = Singleton1.getInstance();
        assertEquals(singleton1,singleton1_1);
        assertEquals("doSomething", singleton1.doSomething());
    }

    public void testSingleton2() {
        Singleton2 singleton2 = Singleton2.getInstance();
        assertNotNull(singleton2);
        Singleton2 singleton2_1 = Singleton2.getInstance();
        assertEquals(singleton2,singleton2_1);
        assertEquals("doSomething", singleton2.doSomething());
    }

    public void testSingleton3() {
        Singleton3 singleton3 = Singleton3.getInstance();
        assertNotNull(singleton3);
        Singleton3 singleton3_1 = Singleton3.getInstance();
        assertEquals(singleton3,singleton3_1);
        assertEquals("doSomething", singleton3.doSomething());
    }

    public void testSingleton4() {
        Singleton4 singleton4 = Singleton4.getInstance();
        assertNotNull(singleton4);
        Singleton4 singleton4_1 = Singleton4.getInstance();
        assertEquals(singleton4,singleton4_1);
        assertEquals("doSomething", singleton4.doSomething());
    }

    public void testSingleton5() {
        Singleton5 singleton5 = Singleton5.instance;
        assertNotNull(singleton5);
        Singleton5 singleton5_1 = Singleton5.instance;
        assertEquals(singleton5, singleton5_1);
        assertEquals("doSomething", singleton5.doSomething());
    }

}
