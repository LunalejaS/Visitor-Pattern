package visitor;

import model.*;

public class CalculateSend implements Visitor {
    private double send = 0;

    private double cost(Product product) {
        double percentage = (product.getWeight() / 100) * 2;
        return product.getPrice() * percentage / 100;
    }

    @Override
    public void visit(Tablet tablet) {
        send += cost(tablet);
    }

    @Override
    public void visit(PC pc) {
        send += cost(pc);
    }
    
    @Override 
    public void visit(Computer computer) {
        send += cost(computer);
    }

    @Override 
    public void visit(TV tv) {
        send += cost(tv);
    }

    @Override
    public double getResult() {
        return send;
    }
}