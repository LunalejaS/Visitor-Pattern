package model;

import visitor.Visitor;

public class TV extends ProductTemplate {
    public TV() {
        super("Televisión", 300, 4000);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}