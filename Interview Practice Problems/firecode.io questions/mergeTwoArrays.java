// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * The idea behind the classic Mergesort algorithm is to 
 * divide an array in half, sort each half, and then use
 * a merge() method to merge the two halves into a single sorted array. 
 */
public static int[] merge(int[] arrLeft, int[] arrRight){
    int[] values = new int[arrRight.length + arrLeft.length];
    int i = 0; //position in arrLeft
    int k = 0; //position in arrRight
    int pos = 0; //position in values 
    
    //compares values in both lists and merges them together
    while(i < arrLeft.length && k < arrRight.length){
        if(arrLeft[i] < arrRight[k]){
            values[pos] = arrLeft[i];
            i++;
            pos++;
        } else {
            values[pos] = arrRight[k];
            k++;
            pos++;
        }
    }
    
    //add the rest of arrLeft
    while(i < arrLeft.length){
        values[pos] = arrLeft[i];
        i++;
        pos++;
    }
    
    //add the rest of arrRight
    while(k < arrRight.length){
        values[pos] = arrRight[k];
        k++;
        pos++;
    }

    return values;
}