public class Unit3Task2 {
    public static void main (String[] args){

        int counter = 0;
        for (int i = 1; i <=99; i++){
            if ( i % 2 != 0){
                counter = counter + 1;
            }
        }
        System.out.println("TOTAL COUNTER = " + counter + "\n");

       int x = 1;
       int array[] = new int[counter];
       for (int i = 0; i < counter; i++, x +=2){
                array[i] = x;
                System.out.print( array[i] + " ");
            }
       System.out.println("\n");

        int y = 99;
       for ( int j = 0; j < counter;  j++, y-=2){
          array[j] = y;
          System.out.print(array[j] + " ");
       }
       }
    }
