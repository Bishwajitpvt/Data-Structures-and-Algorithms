package Array.Problems;

public class largestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original array is ");
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();

        int result = largestElem(arr);
        System.out.print("Largest Element is : " + result);
    }

//    Time Complexity => O(N)
    public static int largestElem(int[] arr) {
        int temp = 0;
        for (int j : arr) {
            if (j > temp) {
                temp = j;
            }
        }
        return temp;
    }
}
