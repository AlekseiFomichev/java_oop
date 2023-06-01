package ru.geekbrains.lesson1;

public class Choco extends Product{
    private double size;
    private double colories;
    public double setSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getColories() {
        return colories;
    }

    public Choco(String brand, String name, double price, double size, double colories) {
        super(brand, name, price);
        this.size = size;
        this.colories = colories;
    }

    public String displayInfo() {
        return String.format("[Brand]%s, [Name]%s = [rub]%f, [size]%f, [grams]%f", brand, name, price, size, colories);
    }

}
