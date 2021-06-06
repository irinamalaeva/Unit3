import java.util.Random;
import java.util.Scanner;

public class Unit3Task11 {
    public static void main(String[] args) {
        System.out.println("input size of array =");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println(" You input size = " + size);
        Random random = new Random();
        int array[] = new int[size];
        int multiplication = 1;
        boolean validElement = false;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
//elements of array can be==0; that is why multiplication=0, or you need exclude 0,condition (array[i]%3==0&&array[i]!=0)
            if (array[i] % 3 == 0) {
                validElement = true;
                multiplication = array[i] * multiplication;
            }
        }
        if (validElement) {
            System.out.println("\n" + "multiplication = " + multiplication);
        } else {

            System.out.println("\n" + "multiplication does exist ");
        }

    }
}

