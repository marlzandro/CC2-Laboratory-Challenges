//Programmer: Marl Zandro T. Andaya
//Working with Variables in Java
//September 5, 2024

import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Full Name: ");
        String name = scan.nextLine();

        System.out.print("Enter your Age: ");
        int age = scan.nextInt();

        System.out.print("Enter your GPA: ");
        float gpa = scan.nextFloat();

        System.out.print("What is your Final Grade(A, B, C): ");
        char grade = scan.next().charAt(0);

        System.out.print("Are you Graduated(true or false)? ");
        boolean grad = scan.nextBoolean();

        System.out.println("\nHello you are " + name + ", You are " + age + "yrs old");
        System.out.println("You have a GPA of " + gpa + " that's great!");
        System.out.println("You have a Final Grade of " + grade + "+ keep up the good job");
        System.out.println("Congrats you are now graduated!!!\n");
    }
}
