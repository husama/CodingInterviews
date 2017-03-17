package husama;

import junit.framework.TestCase;

/**
 * Created by hu on 2017/3/12.
 */
public class FibonacciTest extends TestCase{
    public void testFibocacci() {
        System.out.println(Fibonacci.fibonacci(20));
        System.out.println(Fibonacci.fibonacciRecursively(20));

    }
}
