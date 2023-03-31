package application;

import entities.Pets;

public class PetShop {
    
    public static void main(String[] Args) {
        
        Pets pet = new Pets();

        pet.getName();
        pet.getAge();
        pet.getBreedOfPet();

        System.out.println("Cadastro realizado com sucesso!");
    }
}
