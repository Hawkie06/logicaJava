package exercicios.estrutura.sequencial;
import java.util.Locale;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double pi =  3.14159;



        System.out.println("Digite o raio de um círculo: ");
        double raio = sc.nextDouble();
        double area = pi*(raio*raio);

        System.out.printf("A área de um círculo de raio %.1f é %.4f ", raio, area);

    }
}
/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159*/