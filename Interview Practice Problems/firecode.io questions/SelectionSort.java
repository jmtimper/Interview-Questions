// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Selection sort offers improved performance over bubble sort, 
 * especially for arrays with a large number of elements. 
 * Where bubble sort accumulated the largest elements towards the end of the array,
 * selection sort accumulates the smallest elements at the beginning of the array.
 */
public static int[] selectionSortArray(int[] arr){
    int min = Integer.MAX_VALUE, pos = 0;
    for(int i = 0; i < arr.length; i++){
        for(int k = i; k < arr.length; k++){
            if(arr[k] < min){
                min = arr[k];
                pos = k;
            }
        }
        arr[pos] = arr[i];
        arr[i] = min;
        min = Integer.MAX_VALUE;
    }



    return arr;
}