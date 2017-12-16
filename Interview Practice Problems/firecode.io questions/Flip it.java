// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * You are given an m x n 2D image matrix where each integer represents a pixel. Flip it in-place along its vertical axis.
 */
public static void flipItVerticalAxis(int[][] matrix) {
    for(int k = 0; k < matrix.length; k++){ //row
        int len = matrix[0].length-1;
        for(int i = 0; i < (matrix[0].length/2); i++, len--){ //col
            int temp = matrix[k][i];
            matrix[k][i] = matrix[k][len];
            matrix[k][len] = temp;
        }
    }
}