package hus.oop.lab9.adapter_pattern.bai_1;

public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    
    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
