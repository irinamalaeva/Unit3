import java.util.Random;

public class Unit3Task3 {
    public static void main(String[] args) {
        int counterEven = 0;
        Random random = new Random();
        int array[] = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
            if (array[i] % 2 == 0) {
                counterEven++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("\n" + " counter even= " + counterEven);
    }
}
