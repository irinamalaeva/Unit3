import java.util.Random;

public class Unit3Task4 {
    public static void main(String[] args) {

        int array[] = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int x = 0;
        for (int j = 0; j < array.length; j++) {
            if (j % 2 != 0) {
                array[j] = x;
            }
            System.out.print(array[j] + " ");
        }
    }
}
