import java.util.Scanner;

public class IT2413660Lab7Q1B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Using loop 
        for (int student = 1; student <= 3; student++) 
            {
            System.out.println("Student " + student);
            
            // Input marks for four subjects in a single line

            System.out.print("Enter marks for 4 subjects: ");
            int mark1 = sc.nextInt();
            int mark2 = sc.nextInt();
            int mark3 = sc.nextInt();
            int mark4 = sc.nextInt();
            
            // Calculate the average
            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
            
            // Determine the grade
            String grade;
            if (average >= 75 && average <= 100)  
            {
                grade = "Distinction";
            } else if (average >= 50 && average < 75) 
            {
                grade = "Credit";
            } else 
            {
                grade = "Fail";
            }

            // Output 
            System.out.println("Average is: " + average);
            System.out.println("Overall Grade is: " + grade);

            //Blank line between students
            System.out.println(); 
        }

        
    }
}
