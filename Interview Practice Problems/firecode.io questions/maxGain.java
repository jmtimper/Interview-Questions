// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Given an array of integers, write a method - 
 * maxGain - that returns the maximum gain. 
 * Maximum Gain is defined as the maximum difference 
 * between 2 elements in a list such that the larger 
 * element appears after the smaller element. 
 * If no gain is possible, return 0.
 */
public static int maxGain(int[] a) {
    int max = 0;
    int minVal = a[0];
    for(int i = 1; i < a.length; i++){
        if(a[i] < minVal) minVal = a[i];
        if(a[i] > a[i-1]){
            max = a[i] - minVal;
        }
        if(max < (a[i]-minVal)){
            max = a[i]-minVal;
        }
    }
    return max;

}