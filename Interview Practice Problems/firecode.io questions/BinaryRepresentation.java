// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Write a method to compute the binary representation of a positive integer. 
 * The method should return a string with 1s and 0s. 
 */
public static String computeBinary(int val) {
    if(val == 0) return "0";
    String binary = "";
    for(int i = val; i > 0; i /= 2){
        if(val % 2 == 1) binary += (i % 2);
        else binary += (i + 1) % 2;
    }

    return binary;
}