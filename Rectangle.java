package entities;

public class Rectangle {
    private double length;
    private double widht;

    public Rectangle() {
        this.length = 1.0;
        this.widht = 1.0;
    }

    public Rectangle(double length, double widht) {
        setLenght(length);
        setWidth(widht);
    }

    public double getLenght() {
        return length;
    }

    public void setLenght(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Comprimento inválido! Deve ser maior que 0.0 e menor que 20.0");
        }
    }

    public double getWidth() {
        return widht;
    }

    public void setWidth(double widht) {
        if (widht > 0.0 && widht < 20.0) {
            this.widht = widht;
        } else {
            throw new IllegalArgumentException("Largua inválida! Deve ser maior que 0.0 e menor que 20.0");
        }
    }

    public double calculatePerimeter() {
        return 2 * (length + widht);
    }

    public double calculateArea() {
        return length * widht;
    }
}