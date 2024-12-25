package Uebung_JUnit.Uebung_1;

public class Punkt {
    private int x;
    private int y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void verschiebe(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
