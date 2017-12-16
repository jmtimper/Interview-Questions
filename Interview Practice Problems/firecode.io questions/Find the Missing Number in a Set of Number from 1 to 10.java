// java.util.* has been imported for this problem.
// You don't need any other imports.

public static int findMissingNumber(int[] arr) {
    Arrays.sort(arr);
    int k = arr[0];
    for(int i = 0; i < arr.length; i++, k++){
        if(k != arr[i]) return k;
    }

    return -1;
    
}