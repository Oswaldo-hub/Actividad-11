class Circle extends Shape {

    public static final double PI = 3.141592;

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getarea() {
        return PI * radius * radius;
    }

    public double getperimeter() {
        return PI * getDiameter();
    }

}