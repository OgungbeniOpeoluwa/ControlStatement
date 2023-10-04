package chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of time you will ike to input numbers: ");
        int number = scanner.nextInt();
        System.out.println("Enter an integer: ");
        int userInput = scanner.nextInt();
        int maximum = userInput;
        int minimum = userInput;

        for(int count = 1; count < number ; count ++){
            System.out.println("Enter an integer: ");
            userInput = scanner.nextInt();

            if(userInput > maximum){
                maximum = userInput;
            }
            if(userInput < minimum){
                minimum = userInput;
            }
        }
        int sum = maximum + minimum;
        System.out.println("maximum = "+ maximum + " " + "minimum = "+ minimum);
        System.out.println("The sum of the maximum and minimum numbers = "+ sum);
    }
}
