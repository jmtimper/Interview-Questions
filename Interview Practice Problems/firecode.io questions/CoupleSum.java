// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Given an array of integers, find two numbers such that they sum up to a specific target.
 * The method coupleSum should return the indices of the two numbers in the array, where index1 must be less than index2. 
 */
public static int[] coupleSum(int[] numbers, int target) {
    int[] arr = new int[2];
    for(int i = 0; i < numbers.length; i++){
        for(int k = i; k < numbers.length; k++){
            if((numbers[i] + numbers[k]) == target){
                arr[0] = i+1;
                arr[1] = k+1;
                return arr;
            }
        }
    }
    return arr;
}