package visitor;

import model.Computer;
import model.PC;
import model.Tablet;
import model.TV;

public interface Visitor {
    void visit(Tablet tablet);
    void visit(PC pc);
    void visit(Computer computer);
    void visit(TV tv);
    double getResult();
}