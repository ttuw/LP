import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int[] direito = new int[99];
            int[] esquerdo = new int[99];
            int pares = 0;

            for (int i = 0; i < a; i++) {
                int tamanho = scanner.nextInt();
                char lado = scanner.next().charAt(0);

                if (lado == 'D') {
                    direito[tamanho]++;
                    if (esquerdo[tamanho] > 0) {
                        pares++;
                        esquerdo[tamanho]--;
                        direito[tamanho]--;
                    }
                }
                else {
                    esquerdo[tamanho]++;
                    if (direito[tamanho] > 0) {
                        pares++;
                        direito[tamanho]--;
                        esquerdo[tamanho]--;
                    }
                }
            }
            System.out.println(pares);
        }
    }
}