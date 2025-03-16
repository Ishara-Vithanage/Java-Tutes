public class Q1 {
    public static void main(String[] args) {

        // Using for loops
        for (int i = 1; i < 6; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();

        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0 && i != 6) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();


        // Using while loops
        int i = 1;
        while (i < 6) {
            System.out.print(i + ", ");
            i++;
        }
        System.out.println();

        int j = 0;
        while (j < 15) {
            if (j == 6 || j % 2 != 0) {
                j++;
                continue;
            }
            System.out.print(j + ", ");
            j++;
        }
        System.out.println();
    }
}
