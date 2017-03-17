package husama.dp;

/**
 * Created by hu on 2017/3/14.
 */

/**
 * 如果我们有面值不同(存在面值为1的硬币)的硬币若干枚，如何用最少的硬币凑够n元？
 */
public class LeastCoin {

    public static int leastCoin(final int[] coin, int money) {

        if (coin.length <= 0 || money < 0) {
            return -1;
        }

        int[] d = new int[money + 1];
        int min = 0;

        d[0] = 0;

        for (int i = 1; i <= money; i++) {
            for (int j = 0; j < coin.length && i >= coin[j]; j++) {
                if (j == 0) {
                    min = d[i - coin[j]] + 1;
                } else if (min > d[i - coin[j]] + 1) {
                    min = d[i - coin[j]] + 1;
                }
            }

            d[i] = min;
        }

        return d[money];
    }

}
