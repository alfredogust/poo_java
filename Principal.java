package application;

import entities.Person;

public class Principal {
    public static void main(String[] args) {
        Person einstein = new Person("Albert Einstein", 14, 3, 1879);
        Person newton = new Person("Isaac Newton", 4, 1, 1643);

        einstein.calculaIdade(24, 4, 2023);
        newton.calculaIdade(24, 4, 2023);

        System.out.println(einstein);
        System.out.println(newton);
    }
}
