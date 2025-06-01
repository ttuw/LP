import java.util.Scanner;

class lanche {
    int cod;
    String nome;
    double preco;

    lanche(int cod, String nome, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
    }
}

public class Main {
    public static void main(String[] args) {
        lanche l1 = new lanche(1, "Cachorro Quente", 4.00);
        lanche l2 = new lanche(2, "X-salada", 4.50);
        lanche l3 = new lanche(3, "X-Bacon", 5.00);
        lanche l4 = new lanche(4, "Torrada simples", 2.00);
        lanche l5 = new lanche(5, "Refrigerante", 1.50);

        Scanner sc = new Scanner(System.in);
        int cod = sc.nextInt();
        int qtd = sc.nextInt();

        switch (cod) {
            case 1:
                System.out.printf("Total: R$ %.2f\n", qtd * l1.preco);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n", qtd * l2.preco);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f\n", qtd * l3.preco);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n", qtd * l4.preco);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f\n", qtd * l5.preco);
                break;
        }
    }
}