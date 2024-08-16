package Array.Problems;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.print("Original Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        twoPointer(arr);
    }

//    Time Complexity is => O(N/2) =>> bO(N)
    public static void twoPointer(int[] arr){
        int left=0;
        int right= arr.length-1;
        while (left <= right){
//            swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

//        print array => ( ignore this code in TC)
        System.out.print("Reversed Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    } 
}
