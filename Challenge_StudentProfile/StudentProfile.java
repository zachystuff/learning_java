package Challenge_StudentProfile;

public class StudentProfile {
    String firstName;
    String lastName;
    int grad;
    double gpa;
    String major;

    public StudentProfile(String firstName,
    String lastName,
    int grad,
    double gpa,
    String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grad = grad;
        this.gpa = gpa;
        this.major = major;
    }

    public void increaseGradDate() {
        ++this.grad;
    }
}