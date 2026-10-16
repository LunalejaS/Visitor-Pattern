package visitor;

import model.*;

public class CalculateSubtotal implements Visitor {
    private double subtotal = 0;

    @Override 
    public void visit(Tablet tablet) {
        subtotal += tablet.getPrice();
    }

    @Override
    public void visit(PC pc) {
        subtotal += pc.getPrice();
    }

    @Override 
    public void visit(Computer computer) {
        subtotal += computer.getPrice();
    }

    @Override
    public void visit(TV tv) {
        subtotal += tv.getPrice();
    }

    @Override 
    public double getResult() {
        return subtotal;
    }
}