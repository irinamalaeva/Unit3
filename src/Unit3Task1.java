public class Unit3Task1 {
    public static void main(String[] args) {
        int counter = 0;
        for (int n = 2; n <= 20; n += 2, counter++) {
        }
        System.out.print("total counter= " + counter);

        System.out.println("\n");

        int array[] = new int[counter];
        int x = 2;
        for (int i = 0; i < counter; i++) {
            array[i] = x;
            System.out.print(array[i] + "\t");
            x = array[i] + 2;
        }
        System.out.println("\n");

        int y = 2;
        for (int j = 0; j < counter; j++) {
            array[j] = y;
            System.out.println(array[j] + "\n");
            y = array[j] + 2;
        }
    }
}

