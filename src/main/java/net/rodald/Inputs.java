package net.rodald;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        // Title: Getting User Input(Integer)

//        // Step 1: Create the Scanner
//        Scanner scanner = new Scanner(System.in);
//
//        // Step 2: Getting the User Input and storing it
//        System.out.println("Please enter a number: ");
//        int input = scanner.nextInt();



        // Title: Getting User Input (String)
        // Step 1: Create the Scanner
//        Scanner scanner = new Scanner(System.in);
//
//        // Step 2: Getting the User Input and storing it
//        System.out.println("Please enter a string: ");
//        String line1 = scanner.nextLine();
//        System.out.println("Please enter another string: ");
//        String line2 = scanner.nextLine();


        // Title: Flaw when using Integers and Strings together

        // Step 1: Create the Scanner
        Scanner scanner = new Scanner(System.in);

        // Step 2: Getting the User Input and storing it
        System.out.println("Please enter a number: ");
        int input = scanner.nextInt();
        System.out.println("Please enter a string: ");
        String line1 = scanner.nextLine();


    }
}