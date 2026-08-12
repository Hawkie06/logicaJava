package exercicios.estrutura.sequencial;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        int A = sc.nextInt();

        System.out.print("Digite o valor B: ");
        int B = sc.nextInt();

        System.out.print("Digite o valor C: ");
        int C = sc.nextInt();

        System.out.print("Digite o valor D: ");
        int D = sc.nextInt();

        int diferenca = (A*B - C*D);

        System.out.println("A diferença entre os produtps de A e B e os produtos de C e D é: " + diferenca);


    }
}
/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/