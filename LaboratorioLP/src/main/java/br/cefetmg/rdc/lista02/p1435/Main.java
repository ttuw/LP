import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        while ((a = sc.nextInt()) != 0) {
            int[][] m = new int[a][a];

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {

                    m[i][j] = 1 + Math.min(Math.min(i, j), Math.min(a - 1 - i, a - 1 - j));
                }
            }

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {

                    System.out.printf("%3d", m[i][j]);

                    if (j < a - 1){

                        System.out.printf(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}