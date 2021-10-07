package chapter9.shapes;

public class Rectangle {
    protected double length;
    protected double width;
    protected int numberOfSides = 4;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public void print(){
        System.out.println("I am a rectangle");
    }
}
