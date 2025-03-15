package Tasks;

import org.w3c.dom.ls.LSOutput;

public class Ex_GradingChallenge {
    /*
    Challenge ; ✅ Grade Calculator:
    Write a program that calculates and displays the letter grade for a given numerical score
    (e.g., A, B, C, D, or F) based on the following grading scale:
    A: 90-100
    B: 80-89
    C: 70-79
    D: 60-69
    F: 0-59
     *//*
        **Logic Building | Coding Interview Crack**
    1. Step 1 ->. Find the inputs and outputs - data types and what is exactly the output interviewer looking.
    2. Step 2 - Rough logic , brute force - > explain it side by side.
    3. Step 3 - Write the logic and present the solution (Dry Run)
    4. Step 4 - Optimize and discussion.
    5. Step 5 - Edge Cases and extra discussion.
     *//* Logic:-
    a> 90 = A, a> 80
    a < 59 --> f, a < 69 --> D, a
    */

    public static void main(String[] args) {

        int a = 59;

        String Grade = (a < 60) ? "F" :((a < 70) ? "D" : ((a < 80) ? "C" : ((a < 90) ? "B" : "A") ));

      // Slow Code ---> String Grade = (a >= 90) ? (a >= 80 || a<= 89)? (a >= 70 || a<= 79)? (a >= 60 || a<= 69)? "A" :  "B" : "C" : "D" : "F";

        System.out.println("Your grade is "+ Grade);


    }
}
