package exercicios.estruturas.condicionais;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número X e um número Y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("O ponto pertence ao Quadrante 1");
        } else if (x < 0 && y > 0) {
            System.out.println("O ponto pertence ao Quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("O ponto pertence ao Quadrante 3");
        } else if (x > 0 && y < 0) {
            System.out.println("O ponto pertence ao Quadrante 4");
        } else if (x == 0 && y == 0) {
            System.out.println("O ponto está na Origem");
        } else if (y == 0) {
            System.out.println("O ponto está no Eixo X");
        } else {
            System.out.println("O ponto está no Eixo Y");
        }
    }
}
//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.