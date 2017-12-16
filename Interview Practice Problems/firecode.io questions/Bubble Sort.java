// java.util.* has been imported for this problem.
// You don't need any other imports.

public static int[] bubbleSortArray(int[] arr){
    if( arr.length > 1){
        for(int i = 0; i < arr.length; i++){
            for(int k = 0; k < arr.length-1; k++){
                if(arr[k] > arr[k+1]){
                    int temp = arr[k+1];
                    arr[k+1] = arr[k];
                    arr[k] = temp;
                }
            }
        }
    }
    return arr;
}