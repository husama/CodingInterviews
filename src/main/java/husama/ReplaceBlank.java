package husama;

/**
 * Created by hu on 2017/3/6.
 */
public class ReplaceBlank {

    /**
     * 此方法默认确保char数组的空间是足够的
     * @param str 需要替换空格的char数组
     *
     */
    public static void replaceBlank(char[] str) {
        if(str == null || str.length <= 0) return;

        int oldLength = 0;//表示str原始实际长度
        int numOfBlank = 0;//空格数量

        for(int i = 0; str[i] != '\0'; i++) {
            oldLength++;
            if(str[i] == ' ') {
                numOfBlank++;
            }
        }

        int newLength = oldLength + numOfBlank * 2;
        if (newLength > str.length) return;

        int pOld = oldLength;
        int pNew = newLength;

        while(pOld >= 0 && pNew > pOld) {
            if(str[pOld] != ' ') {
                str[pNew] = str[pOld];
                pNew--;
            } else {
                str[pNew--] = '0';
                str[pNew--] = '2';
                str[pNew--] = '%';
            }
            pOld--;
        }

    }
}
