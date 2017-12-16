// java.util.* has been imported for this problem.
// You don't need any other imports.

public static int fib(int n) {

    if(n == 0){
        return 0;
    } else {
        return n + fib(n-1);
    }

}