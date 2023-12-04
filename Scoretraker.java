import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int[] scores;

    public Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }
}

public class Scoretraker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // Sample data
        students.add(new Student("Yug", new int[]{90, 71, 95}));
        students.add(new Student("Harsh", new int[]{85, 81, 8+2}));

        while (true) {
            System.out.println("1. Add a student");
            System.out.println("2. View student scores");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the number of scores: ");
                    int numScores = scanner.nextInt();
                    int[] scores = new int[numScores];
                    System.out.println("Enter the scores:");
                    for (int i = 0; i < numScores; i++) {
                        scores[i] = scanner.nextInt();
                    }
                    students.add(new Student(name, scores));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.println("Student Scores:");
                    for (Student student : students) {
                        System.out.println("Name: " + student.name);
                        System.out.println("Scores: " + java.util.Arrays.toString(student.scores));
                        System.out.println("Average: " + student.calculateAverage());
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
