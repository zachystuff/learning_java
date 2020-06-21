package ControlFlow;
import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {
        String question = "What color is Man Utd main uniform?";
        String choiceOne = "white";
        String choiceTwo = "red";
        String choiceThree = "pink";
        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println("Pick between " + choiceOne + ", " + choiceTwo + ", " + choiceThree);

        Scanner input = new Scanner(System.in);
        String userAnswer = input.next();
        
        if (correctAnswer.equals(userAnswer.toLowerCase())) {
            System.out.println("Congratulations");
        } else {
            System.out.println("nice try bub! the correct answer is " + correctAnswer );
        }
        input.close();
    }
}