package application;

import java.util.ArrayList;
import java.util.Scanner;
import entities.Pessoa;

public class Pesquisa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        while (true) {
            System.out.println("Digite a idade da pessoa (-1 para sair): ");
            int idade = sc.nextInt();
            if (idade == -1) break;

            System.out.println("Digite o sexo da pessoa (m ou f): ");
            char sexo = sc.next().charAt(0);

            System.out.println("Digite a cor dos olhos da pessoa (a, v, c ou p): ");
            char corOlhos = sc.next().charAt(0);

            System.out.println("Digite a cor dos cabelos da pessoa (l, c, p ou r): ");
            char corCabelos = sc.next().charAt(0);

            System.out.println("Digite o salário da pessoa: ");
            double salario = sc.nextDouble();

            if ((sexo == 'm' || sexo == 'f') && (corOlhos == 'a' || corOlhos == 'v' || corOlhos == 'c' || corOlhos == 'p') && (corCabelos == 'l' || corCabelos == 'c' || corCabelos == 'p' || corCabelos == 'r') && (idade >= 10 && idade <= 100) && salario >= 0) {
                pessoas.add(new Pessoa(sexo, corOlhos, corCabelos, idade, salario));
            } else {
                System.out.println("Dados inválidos. Tente novamente.");
            }
        }

        int contagemMulheres = 0;

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getSexo() == 'f' && pessoa.getIdade() >= 18 && pessoa.getIdade() <= 35 && pessoa.getCorOlhos() == 'c' && pessoa.getCorCabelos() == 'c') {
                contagemMulheres++;
            }
        }

        double porcentagemMulheres = ((double) contagemMulheres / pessoas.size()) * 100;

        System.out.println("Porcentagem de mulheres com idade entre 18 e 35 anos e que tenham olhos castanhos e cabelos castanhos: " + porcentagemMulheres + "%");

        sc.close();
    }
}