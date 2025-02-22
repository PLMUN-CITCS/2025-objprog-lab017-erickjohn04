import java.util.Scanner;

public class GradeCalculator {

    // Method to determine grade based on score
    public static String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input score from the user
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        
        // Get the corresponding grade
        String grade = getGrade(score);
        
        // Output the result
        System.out.println("Your Grade is: " + grade);
        
        scanner.close();
    }
}