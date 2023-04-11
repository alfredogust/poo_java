package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Vendedor;

public class SalarioVendedor {
    
    public static void main(String[] Args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de carros: ");
        Integer numeroDeCarros = sc.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        Double totalVendas = sc.nextDouble();

        System.out.print("Digite o salario fixo: ");
        Double salarioFixo = sc.nextDouble();

        System.out.print("Digite o valor da comissao por carro vendido: ");
        Double valorComissa = sc.nextDouble();

        Vendedor vendedor = new Vendedor(numeroDeCarros, totalVendas, salarioFixo, valorComissa);

        System.out.println("O salario final e: " + vendedor.salarioFinal());

        sc.close();
    }
}
