package novo;

import java.util.Scanner;

public class terreno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura do terreno: ");
        double largura = sc.nextDouble();

        System.out.println("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();

        System.out.println("Digite o preço por metro quadrado: ");
        double precoMetroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double precoTotal = area * precoMetroQuadrado;

        System.out.println("O preço do terreno é de " + precoTotal + " reais.");
    }

}
