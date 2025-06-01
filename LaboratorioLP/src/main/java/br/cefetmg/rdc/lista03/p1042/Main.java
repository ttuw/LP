import java.util.Scanner;
import java.util.Arrays;

class OrdenadorDeNumeros {
    public int[] numeros;
    public int[] numerosOriginais;

    OrdenadorDeNumeros(int a, int b, int c) {
        this.numeros = new int[]{a, b, c};
        this.numerosOriginais = new int[]{a, b, c};
    }

    public void ordenar() {
        Arrays.sort(numeros);
    }

    public void imprimirOrdenados() {
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    public void imprimirOriginais() {
        System.out.println();
        for (int numero : numerosOriginais) {
            System.out.println(numero);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        OrdenadorDeNumeros ordenador = new OrdenadorDeNumeros(a, b, c);
        ordenador.ordenar();
        ordenador.imprimirOrdenados();
        ordenador.imprimirOriginais();
    }
}