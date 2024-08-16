package Array.Problems;

public class smallestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original array is ");
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();

        int result = smallestElem(arr);
        System.out.print("Smallest Element is : " + result);
    }

    //    Time Complexity => O(N)
    public static int smallestElem(int[] arr) {
        int temp = arr[0]; // let arr[0] element be the smallest elem
        for (int i=0; i < arr.length-1; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
            }
        }
        return temp;
    }
}
