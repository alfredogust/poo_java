package entities;

import java.util.Scanner;

public class Pets {
    String nameOfPet;
    Double ageOfPet;
    String breedOfPet;

    Scanner sc = new Scanner(System.in);

    public void getName() {
        System.out.println("Digite o nome do Pet: ");
        nameOfPet = sc.nextLine();

        System.out.println("Nome do Pet: " + nameOfPet);
    }

    public void getAge() {
        //implementar retorno em double
        System.out.println("Digite a idade do Pet: ");
        ageOfPet = sc.nextDouble();
        sc.nextLine();

        System.out.println("Idade do Pet: " + ageOfPet);
    }

    public void getBreedOfPet () {
        System.out.println("Digite a raça do animal: ");
        breedOfPet = sc.nextLine();

        System.out.println("Raça: " + breedOfPet);
    }

}