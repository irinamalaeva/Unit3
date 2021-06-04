import java.util.Random;
import java.util.Scanner;

public class Unit3Task0 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Input size = ");
    int size = sc.nextInt();
    System.out.println("size of array = " +size);
    int array[] = new int [size];
        Random random = new Random();
        for ( int i = 0; i < array.length; i++){
            array [i] = random.nextInt();
            System.out.print ( array[i] + "  ");
        }


}
}
