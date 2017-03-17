package husama.dp;

import junit.framework.TestCase;

/**
 * Created by hu on 2017/3/14.
 */
public class LeastCoinTest extends TestCase{
    public void testLeastCoin() {
        int[] coin = {1, 3, 5};
        System.out.println(LeastCoin.leastCoin(coin,2));
    }
}
