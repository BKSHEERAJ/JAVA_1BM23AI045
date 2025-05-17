package BM23AI045;

import java.util.Scanner;

public class ExamScoreTracker {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 5;
        int[] examScores = new int[NUM_STUDENTS];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter exam scores for each student:");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            examScores[i] = scanner.nextInt();
        }

        int sum = 0;
        int highestScore = examScores[0];
        for (int score : examScores) {
            sum += score;
            if (score > highestScore) {
                highestScore = score;
            }
        }

        System.out.println("\nExam score statistics:");
        System.out.println("Sum of all scores: " + sum);
        System.out.println("Highest score attained: " + highestScore);

        scanner.close();
    }
}

//output:
Enter exam scores for each student:
Enter score for student 1: 90
Enter score for student 2: 85
Enter score for student 3: 99
Enter score for student 4: 82
Enter score for student 5: 89

Exam score statistics:
Sum of all scores: 445
Highest score attained: 99

Process finished with exit code 0
