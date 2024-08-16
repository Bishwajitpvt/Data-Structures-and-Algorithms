package Array.basics;

import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        int[][] td = {{1,2,3},{4,5,6}};

//        print
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(td[i][j] + " ");
            }
//            next line
            System.out.println();
        }



//        ----------------------------- user input ---------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and col");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

//        take value into array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

//        print
        System.out.println("printing .......");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
