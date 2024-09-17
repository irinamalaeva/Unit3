

import java.util.Random;
import java.util.Scanner;

public class Unit3Task12 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("input size of array = ");
        int size = sc.nextInt();
        System.out.println(" size = " + size);

        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        double counter = 0;
        double summa = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                summa = summa + array[i];
                counter = counter + 1;
            }
        }
        double everage = summa / counter;
        System.out.println("\n" + "everage = " + everage);

    }
}
