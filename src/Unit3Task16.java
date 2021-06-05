import java.util.Random;
import java.util.Scanner;

public class Unit3Task16 {
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

        int arrayNull[] = new int[size];
        for (int i = 0; i < arrayNull.length; i++) {
            if (i % 2 == 0) {
                int change = array[i];
                arrayNull[i] = change;
            } else {
                arrayNull[i] = 0;
            }
            System.out.print(arrayNull[i] + " ");
        }
    }
}
