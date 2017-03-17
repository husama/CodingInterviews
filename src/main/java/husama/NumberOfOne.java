package husama;

/**
 * Created by hu on 2017/3/13.
 */
public class NumberOfOne {
    public static int numberOfOne1(int n) {
        int count = 0;
        int flag = 1;
        while(flag != 0) {
            if ((n & flag) !=0) {
                count++;
            }
            flag = flag << 1;
        }

        return count;
    }

    public static int NumberOfOne2(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
 }
}
