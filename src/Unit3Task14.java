import java.util.Random;
import java.util.Scanner;

public class Unit3Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("input size = ");
        int size = sc.nextInt();
        int array[] = new int[size];
        for ( int i = 0; i < array.length; i++){
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
        int min = 1;
        for ( int i = 0; i < array.length; i++){
             if (array[i]%2 != 0){
                    if ( array[i] < min){
                        min = array[i]; }
             }
        }
        System.out.println("\n" + "min odd = " + min);
    }
}
