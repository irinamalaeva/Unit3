import java.util.Random;

public class Unit3Task6 {
    public static void main(String[] args) {

        Random random = new Random();
        int array[] = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        boolean compare = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                compare = false;
                break;
            }
        }
        if (compare) {
            System.out.println("Strictly increasing sequence");
        } else {
            System.out.println("Not increasing sequence");
        }

    }

}
