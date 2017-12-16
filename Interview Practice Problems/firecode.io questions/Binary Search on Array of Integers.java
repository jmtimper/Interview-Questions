// java.util.* has been imported for this problem.
// You don't need any other imports.

public static Boolean binarySearch(int[] arr, int n){
    if(arr.length == 0) return false;
    if(arr.length == 1 && arr[0] != n) return false; 
    if(arr.length == 1 && arr[0] == n) return true; 
    int start = 0;
    int mid = arr.length/2;
    int end = arr.length;
    int pos = mid;
    while(arr[pos] != n){
        if(n > arr[pos]){
            start = mid;
            mid = (end-start)/2+start;
        } else if(n < arr[pos]){
            end = mid;
            mid = (end-start)/2+start;
            System.out.println("here " + start+ " " + mid + " " + end + " pos= " + pos);
        }
        pos = mid;
        if(arr[pos] == n) return true;
        if(start+1 == end){
            System.out.println(start+ " " + mid + " " + end + " pos= " + pos);
            return false;
        }
    }
    return true;
}