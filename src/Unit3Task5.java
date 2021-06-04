import java.util.Random;

public class Unit3Task5 {
    public static void main(String[] args){
        Random random = new Random();
        int array1[] = new int[5];
        int array2[] = new int[5];
        double  sum1 = 0;
        double  sum2 = 0;
        for (int i = 0; i < array1.length; i++ ){
            array1[i] = random.nextInt(15);
           sum1 = sum1 + array1[i];
            System.out.print( array1[i] + " ");
        }
        double average1 = sum1 / 5;
        System.out.println( "\n" + "average1 = " + average1);

        System.out.println();

        for (int j = 0; j < array2.length; j++){
            array2[j] = random.nextInt(15);
            sum2 = sum2 + array2[j];
            System.out.print( array2[j] + " ");
        }
        double average2 = sum2 / 5;
        System.out.println( "\n" + "average2 = " + average2);
    }

}
