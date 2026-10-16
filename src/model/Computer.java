package model;

import visitor.Visitor;

public class Computer extends ProductTemplate {
    public Computer() {
        super("Computadora de Torre", 600, 6000);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}