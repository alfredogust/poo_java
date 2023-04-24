package application;

import java.util.Locale;

import entities.Empregado;

public class EmpregadoTeste {
    /*Escreva um aplicativo de teste chamado EmpregadoTeste que cria dois objetos Empregado e exibe o salário anual de cada objeto.
     Então dê a cada Empregado um aumento de 10% e exiba novamente o salário anual de cada Empregado. */

    public static void main(String[] Args) {
        Locale.setDefault(Locale.US);

        Empregado empregado1 = new Empregado("Alfredo", "Gustavo", 5000.0);
        System.out.println("Salario anual do empregado 1: " + empregado1.getSalarioAnual());

        Empregado empregado2 = new Empregado("Carol", "Ikeda", 7000.0);
        System.out.println("Salario anual do empregado 2: " + empregado2.getSalarioAnual());

        empregado1.aumentarSalario(10.0);
        empregado2.aumentarSalario(10.0);

        System.out.println("Salario anual do empregado 1 apos o aumento: " + empregado1.getSalarioAnual());
        System.out.println("Salario anual do empregado 2 apos o aumento: " + empregado2.getSalarioAnual());
    }
}
