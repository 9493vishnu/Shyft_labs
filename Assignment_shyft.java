public class Main {
    public static int find_index(int[] arr) {
        int low = 0, high = 1;
//If the array is infinite, that means we
 //don’t have proper bounds to apply binary search.
 //So in order to find position of key, 
//first we find bounds and then apply binary search algorithm.

        while (arr[high] != -1) {
            low = high;
            high *= 2;
        }
// ANd searching with the boundaries we got previously
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return high;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 1, 2, 7, 8, 20, 33, -1, -1, -1, -1, -1, -1, -1};
       
        System.out.println(find_index(arr1));
    
    }
}