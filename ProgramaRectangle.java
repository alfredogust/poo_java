package app;

import entities.Rectangle;

public class ProgramaRectangle {
    
    public static void main (String[] Args) {
        
        Rectangle rectangle = new Rectangle();
        System.out.println("Retangulo 1: ");
        System.out.println("Comprimento: " + rectangle.getLenght());
        System.out.println("Largura: " + rectangle.getWidth());
        System.out.println("Perimetro: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());

        Rectangle rectangle2 = new Rectangle(5.0, 10.0);
        System.out.println("\nRetangulo 2: ");
        System.out.println("Comprimento: " + rectangle.getLenght());
        System.out.println("Largura: " + rectangle.getWidth());
        System.out.println("Perimetro: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());

        try {
            rectangle2.setLenght(30.0);
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage());
        }
    }
}
