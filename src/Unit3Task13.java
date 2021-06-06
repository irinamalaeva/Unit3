
package com.company;

import java.util.Random;
import java.util.Scanner;

public class Unit3Task13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input c = ");
        int c = sc.nextInt();
        System.out.println("size of array = ");
        int size = sc.nextInt();
        Random random = new Random();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(size);
            System.out.print(array[i] + " ");
        }
        double sum = 0;
        double counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > c) {
                sum = sum + array[i];
                counter = counter + 1;
            }
        }
        double average = sum / counter;

        boolean existence = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > c) {
                existence = false;
            }
        }
        if (existence == false) {
            System.out.println("\n" + "average = " + average);
        } else {
            System.out.println("\n" + "no exist");
        }

    }
}







