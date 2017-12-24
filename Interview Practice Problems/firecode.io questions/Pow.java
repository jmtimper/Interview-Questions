// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Write a method - pow(x,n) that returns 
 * the value of x raised to the power of n (xn). n can be negative!  
 */
public static double pow(double x, int n) {
    if(n > 0) return x * pow(x, n-1);
    if(n < 0) return 1/(x * pow(x, n+1));
    return 1;
}