package Classes;

public class Triangle {

    static int numOfSides = 3;
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    public Triangle (double base,
    double height,
    double sideLenOne,
    double sideLenTwo,
    double sideLenThree) {
        // on the left is function attributes, on the right are the entered parameters.
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double findArea() {
        return (this.base * this.height) / 2;
    }
}