package husama;

import junit.framework.TestCase;

/**
 * Created by hu on 2017/3/6.
 */
public class FindInPartiallySortedMatrixTest extends TestCase{

    private static int[][] matrix = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};

    public void testFindInPartiallySortedMatrix_03(){

        assertFalse(FindInPartiallySortedMatrix.find(null,4,4,14));
        assertTrue(FindInPartiallySortedMatrix.find(matrix,4,4,7));
        assertTrue(FindInPartiallySortedMatrix.find(matrix,4,4,1));
        assertTrue(FindInPartiallySortedMatrix.find(matrix,4,4,15));
        assertTrue(FindInPartiallySortedMatrix.find(matrix,4,4,9));
        assertTrue(FindInPartiallySortedMatrix.find(matrix,4,4,6));
        assertFalse(FindInPartiallySortedMatrix.find(matrix,4,4,14));

    }

}
