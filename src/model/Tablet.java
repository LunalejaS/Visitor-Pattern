package model;

import visitor.Visitor;

public class Tablet extends ProductTemplate {
    public Tablet() {
        super("Tablet", 200, 250);
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}