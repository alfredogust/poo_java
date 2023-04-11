package application;

import java.util.Scanner;
import entities.Refeicao;

public class CaloriasRefeicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha uma opção de prato: ");
        System.out.println("1 - Vegetariano");
        System.out.println("2 - Peixe");
        System.out.println("3 - Frango");
        System.out.println("4 - Carne");
        Integer prato = sc.nextInt();
        
        System.out.println("Escolha uma opção de sobremesa: ");
        System.out.println("1 - Abacaxi");
        System.out.println("2 - Sorvete diet");
        System.out.println("3 - Mouse diet");
        System.out.println("4 - Mouse chocolate");
        Integer sobremesa = sc.nextInt();
        
        System.out.println("Escolha uma opção de bebida: ");
        System.out.println("1 - Chá");
        System.out.println("2 - Suco de laranja");
        System.out.println("3 - Suco de melão");
        System.out.println("4 - Refrigerante diet");
        Integer bebida = sc.nextInt();
        
        Refeicao refeicao = new Refeicao(prato, sobremesa, bebida);
        
        System.out.println("A quantidade total de calorias da refeição é: " + refeicao.calculaTotalCalorias());

        sc.close();
    }
}
