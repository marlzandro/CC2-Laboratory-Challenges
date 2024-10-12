// Programmer: Marl Zandro T. Andaya
// Date: October 2nt week 2024
// Laboratory Challenge No. 7: Password Validation System


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);
        String password;
        
        // Start an infinite loop that will continue until a valid password is entered
        while (true) {
            // Prompt the user to enter their password
            System.out.print("Enter your password: ");
            password = scan.nextLine(); // Read the user input as a string
            
            // Check if the password meets the following criteria:
            // 1. Length is at least 8 characters
            // 2.  Contains at least one digit (\\d)
            // 3. Contains at least one uppercase letter
            if (password.length() >= 8 && password.matches(".*d*") && password.matches(".*[A-Z].*")) {
                // If the password is valid, print a success message and exit the loop
                System.out.println("Your password is valid!");
                break;
            } 
            
            else {
                // If the password doesn't meet the criteria, display an error message
                System.out.println("Password must contain at least 8 characters, including one uppercase letter and one number.");
            }
        }   
        
        // Close the Scanner object to prevent resource leaks
        scan.close();
    }
}