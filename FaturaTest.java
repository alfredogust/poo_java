package application;

import java.util.Locale;

import entities.Fatura;

public class FaturaTest {
    
    public static void main(String[] Args) {
        Locale.setDefault(Locale.US);

        Fatura fatura1 = new Fatura("001", "Mouse", 2, 50.0);
        System.out.println("Total da fatura: " + fatura1.getTotalFatura());

        Fatura fatura2 = new Fatura("002", "Teclado", -1, 100.0);
        System.out.println("Total da fatura: " + fatura2.getTotalFatura());

        Fatura fatura3 = new Fatura("003", "Monitor", 1, -200.0);
        System.out.println("Total da fatura: " + fatura3.getTotalFatura());
    }
}
