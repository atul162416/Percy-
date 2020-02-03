import java.util.*;

public class A {
    public A() {
        System.out.println("hello");
    }

    static int row = 4;
    static int col = 4;
    static int arr[][] = new int[row][col];

    static void set() {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = k++;
            }
        }
    }

    static int[][] get() {
        return arr;
    }

    public static void main(String args[]) {
       // System.out.println("hey");
    A obj =new A();

    set();

    int arr1[][]=Arrays.copyOf(arr,arr.length);
    for( int i = 0;i<arr1.length;i++)
    {

        for (int j = 0; j < arr1[i].length; j++) {
            System.out.println(arr[i][j] + " ");
        }
        System.out.println();
    }
}

}
