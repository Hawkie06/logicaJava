package exercicios.estrutura.sequencial;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu número: ");
        int num = sc.nextInt();

        System.out.print("Digite seu número de horas trabalhadas: ");
        int horas = sc.nextInt();

        System.out.print("Digite o valor que recebe por hora: ");
        double valor = sc.nextDouble();

        double salario = horas * valor;

        System.out.printf("O funcionário número: %s recebe: %.2f ",num,salario);
    }
}
/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/