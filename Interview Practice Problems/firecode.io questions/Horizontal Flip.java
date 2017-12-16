// java.util.* has been imported for this problem.
// You don't need any other imports.

public static void flipHorizontalAxis(int[][] matrix) {
    if(matrix[0].length > 1){
        for(int i = 0; i < matrix[0].length; i++){
            for(int k = 0; k < matrix.length/2; k++){
                int temp = matrix[k][i];
                matrix[k][i] = matrix[matrix.length-1-k][i];
                matrix[matrix.length-1-k][i] = temp;
            }
        }
    }
    
}