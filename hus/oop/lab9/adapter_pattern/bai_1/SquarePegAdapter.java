package hus.oop.lab9.adapter_pattern.bai_1;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(0);
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return (this.peg.getWidth() / Math.sqrt(2));
    }
}
