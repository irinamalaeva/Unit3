import java.util.Random;
import java.util.Scanner;

public class Unit3Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("input size = ");
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // I do not think, that example below is appropriate, but it is working
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                int j = array[i];
                System.out.print(j + " ");
            }
        }
// Here is another one
        System.out.println();
        if (size % 2 == 0) {
            int newSize1 = size / 2;
            int newArray1[] = new int[newSize1];
            int j = 0;
            for (int i = 0; i < array.length - 1; i += 2) {
                newArray1[j] = array[i];
                System.out.print(newArray1[j] + " ");
                j = j + 1;
            }
        }
        if (size % 2 != 0) {
            int newSize2 = (size / 2) + 1;
            int newArray2[] = new int[newSize2];
            int k = 0;
            for (int i = 0; i < array.length; i += 2) {
                newArray2[k] = array[i];
                System.out.print(newArray2[k] + " ");
                k = k + 1;
            }

        }
    }
}
