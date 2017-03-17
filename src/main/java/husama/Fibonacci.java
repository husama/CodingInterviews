package husama;

/**
 * Created by hu on 2017/3/12.
 */
public class Fibonacci {
    public static long fibonacciRecursively(long n) {
        if (n <= 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacciRecursively(n - 1) + fibonacciRecursively(n - 2);
    }

    /**
     * @param n n为正整数
     */
    public static long fibonacci(long n) {
        if (n <= 0 || n == 1) {
            return n;
        }

        long fibOne = 1, fibTwo = 0, fibSum = 0;
        for(long i = 2; i <= n; i++) {
            fibSum = fibOne + fibTwo;
            fibTwo = fibOne;
            fibOne = fibSum;
        }

        return fibSum;
    }
}
