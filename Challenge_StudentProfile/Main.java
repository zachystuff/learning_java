package Challenge_StudentProfile;

import Primitive_data_type.Student;

public class Main {
    public static void main(String[] args) {
        // create student profile
        StudentProfile studentA = new StudentProfile("aa", "aa", 2020, 3.23, "aa");
        StudentProfile studentB = new StudentProfile("bb", "bb", 2019, 3.00, "bb");

        studentA.increaseGradDate();
        System.out.println(studentA.grad);

    }
}