package Primitive_data_type;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;
        String studentFirstName = "Zach";
        String studentLastName = "Yusuf";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);

        // To get an input from user, you have to use scanner
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to change ot it?");
        
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);        
        input.close();
    }
}