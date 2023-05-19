package br.com.alura.desafio.model;

public class Item implements Comparable<Item> {
    private String name;

    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.getName() + " - " + this.getPrice() + ";";
    }

    @Override
    public int compareTo(Item anotherValue) {
        return Double.compare(this.price, anotherValue.price);
    }
}
