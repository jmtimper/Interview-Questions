// java.util.* has been imported for this problem.
// You don't need any other imports.

public static int singleNumber(int[] A) {
    Arrays.sort(A);
    if(A.length < 2) return A[0];
    for(int i = 0; i < A.length-1; i++){
        if(A[i] == A[i+1]){
            while(A[i] == A[i+1])
                i++;
        } else {
            return A[i];
        }
    }
    if(A[A.length-1] != A[A.length-2]) return A[A.length-1];
    return -2;
}