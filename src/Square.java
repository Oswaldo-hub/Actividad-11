class Square extends Shape {

    protected double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }


    public double getarea() {
        return sideLength * sideLength;
    }

    public double getperimeter() {
        return sideLength * 4;
    }

}