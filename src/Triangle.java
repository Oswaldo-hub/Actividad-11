public class Triangle extends Shape {
    private double sideLength;
    private double heightLength;

    public Triangle(double sideLength) {
        this.sideLength = sideLength;
        this.heightLength = calculateHeightLength();
    }

    public double getarea() {
        return (sideLength * heightLength) / 2.0;
    }

    public double getperimeter() {
        return sideLength * 3.0;
    }

    private double calculateHeightLength() {
        return (Math.sqrt(3.0)
                * this.sideLength) / 2.0;
    }
}
