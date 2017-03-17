package husama.dp;

import junit.framework.TestCase;




/**
 * Created by hu on 2017/3/15.
 */
public class LongestIncreasingSubsequenceTest extends TestCase{
    public static void testLongestIncreasingSubsequence() {
        int[] nums = {5,3,4,8,6,7,8,1,2,3,4,5,56,5,89};

        System.out.println(LongestIncreasingSubsequence.longestIncreasingSubsequence(nums));
    }
}
