package husama.dp;

/**
 * Created by hu on 2017/3/14.
 */
public class LongestIncreasingSubsequence {
    public static int longestIncreasingSubsequence(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] lis = new int[nums.length];
        lis[0] = 1;
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            //求以nums[i]结尾的最长非降序列
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    lis[i] = Math.max(lis[i],lis[j]);
                }
            }
            lis[i]++;
            max = Math.max(max,lis[i]);
        }

        return max;
    }
}
