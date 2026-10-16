package model;

import visitor.Visitor;

public class PC extends ProductTemplate {
    public PC() {
        super("Computadora portatil", 400, 1000);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}