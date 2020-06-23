package Classes;

public class Main_1 {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 15);
        Triangle triangleB = new Triangle(10, 5, 10, 5, 10);

        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);

        System.out.println(triangleA.base);

        System.out.println(Triangle.numOfSides);
    }
}