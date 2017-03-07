package husama;

import husama.ReplaceBlank;
import junit.framework.TestCase;

/**
 * Created by hu on 2017/3/6.
 */
public class ReplaceBlankTest extends TestCase {

    public void testReplaceBlank() {
        char[] str = new char[30];
        String temp = " We are happy!";
        temp.getChars(0,13,str,0);
        ReplaceBlank.replaceBlank(str);
        System.out.println(str);
    }
}
