// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * The next number is found by adding up the two numbers before it.
 * 
 * Your goal is to write an optimal method - betterFibonacci that returns the nth Fibonacci 
 * number in the sequence. n is 0 indexed, which means that in the sequence 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 
 * ..., n == 0 should return 0 and n == 3 should return 2. Your method should exhibit a runtime complexity of 
 * O(n) and use constant O(1) space. With this implementation, your method should be able to compute larger 
 * sequences where n > 40. 
 */
 public static int betterFibonacci(int n) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i <= n; i++){
        if(list.size() == 0) list.add(0);
        else if(list.size() == 1) list.add(1);
        else{
            list.add(list.get(i-2)+list.get(i-1));
        }
    }
    return list.get(n);
}