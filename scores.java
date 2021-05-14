import java.util.*;
public class scores {


           public static void main(String[] args) {		
				Scanner input = new Scanner(System.in);
				int highest_score = 0;
				int lowest_score = 100;
				double avg_score = 0;
				int counter = 0;
				int counter_A = 0;
				int counter_B = 0;
				int counter_C = 0;
				int counter_Failed = 0;
				int sum = 0;
				
				boolean more_grades = true;
				
				while (more_grades) {
					System.out.println("Enter grade: ");
					int grade = input.nextInt();
					counter += 1;
					sum += grade;
					avg_score = sum/counter;
					
					if (grade > highest_score) {
						highest_score = grade;
					}
					
					if (grade < lowest_score) {
						lowest_score = grade;
					}
					
					if (grade >= 90) {
						counter_A += 1;
					}
					
					if (grade >= 80 & grade < 90) {
						counter_B += 1;
					}
					
					if (grade >= 70 & grade < 80) {
						counter_C += 1;
					}
					
					if (grade < 70) {
						counter_Failed += 1;
					}
					
					System.out.println("Would you like to enter more grades? Y/N: ");
					String answer = input.next();
					
					if (String.valueOf(answer).equals("N") | String.valueOf(answer).equals("n")) {
						more_grades = false;
						
						System.out.println("Highest score: " + highest_score);
						System.out.println("Lowest score: " + lowest_score);
						System.out.println("Average score: " + avg_score);
						System.out.println("Number of students that got A: " + counter_A);
						System.out.println("Number of students that got B: " + counter_B);
						System.out.println("Number of students that got C: " + counter_C);
						System.out.println("Number of students that failed: " + counter_Failed);
						input.close();
						System.exit(0);
					}
				}
			}
	}


