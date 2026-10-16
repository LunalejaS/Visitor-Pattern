package model;

import visitor.Visitor;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static class Line {
        final Product product;
        final int number;
        Line(Product product, int number) {
            this.product = product;
            this.number = number;
        }
    }

    private final List<Line> lines = new ArrayList<>();

    public void add(Product product, int number) {
        if (product == null) {
            throw new IllegalArgumentException("EL producto no puede ser nulo.");
        }
        if (number <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero.");
        }
        lines.add(new Line(product, number));
    }

    public void accept(Visitor visitor) {
        for (Line line : lines) {
            for (int i = 0; i < line.number; i++) {
                line.product.accept(visitor);
            }
        }
    }

    public String getSummary() {
        StringBuilder sb = new StringBuilder();
        for (Line line : lines) {
            sb.append(String.format(java.util.Locale.US,
                    "  %d x %s ($%.2f c/u)%n",
                    line.number, line.product.getName(), line.product.getPrice()));
        }
        return sb.toString();
    }
}