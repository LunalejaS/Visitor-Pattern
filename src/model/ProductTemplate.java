package model;

public abstract class ProductTemplate implements Product {
    private final String name;
    private final double price;
    private final double weight;

    protected ProductTemplate(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override 
    public double getWeight() {
        return weight;
    }
}