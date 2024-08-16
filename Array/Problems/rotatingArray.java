package Array.Problems;

public class rotatingArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2; // Rotate by 2

//        rotateBruteForce(arr, d);
//        System.out.print("Brute Force : ");
//        for (int i : arr) {
//            System.out.print(+i + " ");
//        }
//        System.out.println();

        rotateUsingReverse(arr,d);
        System.out.print("Reverse Method : ");
        for (int i : arr) {
            System.out.print(+i + " ");
        }

    }

    //    Time Complexity O(d*N) || SC O(1)
    public static void rotateBruteForce(int[] arr, int d) {
        /*
         * For each rotation:
         * Store the last element in a temporary variable.
         * Shift all elements one position to the right.
         * Place the temporary variable at the first position.
         * */
        int n = arr.length;
        d = d % n; // In case k is greater than the array length

        for (int i = 0; i < d; i++) {
            int temp = arr[n - 1];
//            rotating
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }

    //    Time Complexity O(N) || SC O(1)
    public static void rotateUsingReverse(int[] arr, int d) {
        /*
        * Reverse the entire array.
        * Reverse the first k elements.
        * Reverse the last n-k elements.
        * */
        int n = arr.length;
        d = d % n;

        reverse(arr, 0, n - 1); // reverse entire array
        reverse(arr, 0, d - 1); // reverse only the "d" length elements
        reverse(arr, d, n - 1); // reverse rest of the element
    }

    public static void reverse(int[] arr, int start, int end){
        while (start < end){
//            swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
