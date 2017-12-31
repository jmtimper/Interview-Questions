// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Write a method - isPowOfTwo to test whether or not a 
 * given positive integer is a power of 2. Your method 
 * should run in constant O(1) time and use O(1) space.
 */
public static boolean isPowOfTwo(int num) {
    if(num == 1) return true;
    int pow = 2;
    while(pow < num){
        pow *= 2;
    }
    return num == pow;
}