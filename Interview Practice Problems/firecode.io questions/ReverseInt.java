// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Implement a method that reverses an integer 
 * - without using additional heap space
 */
public static int reverseInt(int x) {
    int num = 0;
    do{
        num = num * 10 + x % 10;
        x = x / 10;
    } while (x != 0);
    return num;
    
}