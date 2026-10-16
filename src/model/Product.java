package model;

import visitor.Visitor;

public interface Product {
    String getName();
    double getPrice();
    double getWeight();
    void accept(Visitor visitor);
}