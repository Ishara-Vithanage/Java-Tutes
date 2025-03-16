public class Q2 {
    public static void main(String[] args) {

        // First pattern
        System.out.println("First Pattern");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // Second pattern
        System.out.println("\nSecond Pattern");
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j < i+1; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }

        // Third pattern
        System.out.println("\nThird Pattern");
        int l, m;
        for (l = 1; l <= 6; l++) {
            for (m = 1; m <= 6 - l; m++) {
                System.out.print(" ");
            }
            for (m = 1; m <= l; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Fourth pattern
        System.out.println("\nFourth Pattern");
        int spaceCount = 0;
        for (int i = 10; i > 0; i--) {
            if (i % 2 != 0) {
                for (int j = 0; j < spaceCount; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j < i+1; j++) {
                    System.out.print("*");
                }

                for (int j = 0; j < spaceCount; j++) {
                    System.out.print(" ");
                }
                System.out.println();
                spaceCount += 1;
            }
        }
    }
}
