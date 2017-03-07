package husama;

/**
 * Created by hu on 2017/3/6.
 */
public class FindInPartiallySortedMatrix {

    /**
     *
     * @param matrix 已按照规则部分排序的矩阵
     * @return
     */
    public static boolean find(int[][] matrix, int row, int col, int number){

        if(matrix == null || row <= 0 || col <= 0) {
            return false;
        }

        boolean find = false;

        int pRow = 0;
        int pCol = col - 1;

        while(pRow < row && pCol >= 0) {

            if(matrix[pRow][pCol] < number) {
                pRow++;
            } else if (matrix[pRow][pCol] > number) {
                pCol--;
            } else {
                find = true;
                break;
            }
        }

        return find;
    }
}
