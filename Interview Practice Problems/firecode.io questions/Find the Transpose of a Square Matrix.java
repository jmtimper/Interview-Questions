// java.util.* has been imported for this problem.
// You don't need any other imports.

public static void transposeMatrix(int[][] matrix) {
    
    if(matrix.length > 1){
        for(int i = 0; i < matrix.length; i++){
            for(int k = i; k < matrix[0].length; k++){
                int temp = matrix[i][k];
                matrix[i][k] = matrix[k][i];
                matrix[k][i] = temp;
            }
        }
    }
}