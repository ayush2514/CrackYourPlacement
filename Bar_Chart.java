
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = scr.nextInt();
        int largest = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] > largest)
                largest = A[i];
        }
        for (int i = largest; i >= 1; i--) {
            for (int j = 0; j < n; j++) {
                if (A[j] >= i)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
        scr.close();
    }

}