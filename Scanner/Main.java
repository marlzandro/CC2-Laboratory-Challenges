//Programmer: Marl Zandro T. Andaya
//Asking the User to Input Name and Age
//September 7, 2024
import java.util.Scanner;  // Import the Scanner class for user input

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read the user's name

        // Step 3: Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Read the user's age as an integer

        // Step 4: Display the entered information
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}