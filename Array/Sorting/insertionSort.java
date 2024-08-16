package Array.Sorting;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {54,26,93,17,77,31,414,55,20};
        isBrute(arr);
    }

    static void isBrute(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int j =i;
            while (j>0 && arr[j-1] > arr[j]){
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        //        print
        System.out.println("Output : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
