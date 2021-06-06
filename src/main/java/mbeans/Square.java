package mbeans;

public class Square implements SquareMBean{
    private double square = 0;

    @Override
    public double getSquare() {
        return this.square;
    }

    @Override
    public void refreshSquare(String r) {
        double rad = Double.parseDouble(r);
        square = ((rad * rad) / 2.0) + (rad * (rad / 2.0) + (Math.PI * rad * rad));
    }
}
