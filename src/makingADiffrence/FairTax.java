package makingADiffrence;

import java.util.Scanner;

public class FairTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double CONSTANT = 0.23;
        double total = 0;
        System.out.println("FAIR TAX CALCULATOR,ENTER 1 TO CONTINUE OR PRESS 0 TO STOP:");
        int stopper = scanner.nextInt();
        while (stopper != 0){
            System.out.println("""
                    CHOOSE THE RANGE YOUR HOUSEHOLD FALL IN:
                    1. A person
                    2. couple 
                    3. A person and a dependent
                    4. Couple and 1 dependant 
                    5. 1 person and 2 dependents
                    6. Couple and 2 dependents 
                    7. 1 person and 3 dependents 
                    8. Couple and 3 dependents
                    9. 1 person and 4 dependents
                    10 Couple and 4 dependents 
                    11. 1 person and 5 dependents 
                    12. Couple and 5 dependents
                    13. 1 person and 6 dependents 
                    14. Couple and 6 dependents
                    15.1 person and 7 dependents 
                    16. Couple and 7 dependents""");
            int user_input = scanner.nextInt();
            switch(user_input){
                case 1 :{
                    System.out.println("KINDLY INPUT MONTHLY EXPENSES FOR THE MONTH:");
                    int spending = scanner.nextInt();
                    total = (spending * CONSTANT) - 247;
                    System.out.println("Your monthly fair tax estimation is  : $" + total);
                    break;
                }
                case 2:{
                    System.out.println("KINDLY INPUT MONTHLY EXPENSES FOR THE MONTH:");
                    int spending = scanner.nextInt();
                    total = (spending * CONSTANT) - 494;
                    System.out.println("Your monthly fair tax estimation is :$ " + total);
                    break;
                }
                case 3: {
                    System.out.println("KINDLY INPUT MONTHLY EXPENSES FOR THE MONTH:");
                    int spending = scanner.nextInt();
                    total = (spending * CONSTANT) - 334;
                    System.out.println("Your monthly fair tax estimation is :$ " + total);
                    break;
                }
                case 4:{
                    System.out.println("KINDLY INPUT MONTHLY EXPENSES FOR THE MONTH:");
                    int spending = scanner.nextInt();
                    total = (spending * CONSTANT) - 581;
                    System.out.println("Your monthly fair tax estimation is :$ " + total);
                    break;
                }
                case 5:{
                    System.out.println("KINDLY INPUT MONTHLY EXPENSES FOR THE MONTH:");
                    int spending = scanner.nextInt();
                    total = (spending * CONSTANT) - 421;
                    System.out.println("Your monthly fair tax estimation is  :$ " + total);
                    break;
                }
                case 6:{
                    System.out.println("KINDLY INPUT MONTHLY EXPENSES FOR THE MONTH:");
                    int spending = scanner.nextInt();
                    total = (spending * CONSTANT) - 668;
                    System.out.println("Your monthly fair tax estimation is  :$ " + total);
                    break;
                }
                case 7:{
                    System.out.println("KINDLY INPUT MONTHLY EXPENSES FOR THE MONTH:");
                    int spending = scanner.nextInt();
                    total = (spending * CONSTANT) - 508;
                    System.out.println("Your monthly fair tax estimation is :$ " + total);
                    break;
                }
                case 8:{
                    System.out.println("KINDLY INPUT MONTHLY EXPENSES FOR THE MONTH:");
                    int spending = scanner.nextInt();
                    total = (spending * CONSTANT) - 755;
                    System.out.println("Your monthly fair tax estimation is :$ " + total);
                    break;
                }
                case 9:{
                    System.out.println("KINDLY INPUT MONTHLY EXPENSES FOR THE MONTH:");
                    int spending = scanner.nextInt();
                    total = (spending * CONSTANT) - 595;
                    System.out.println("Your monthly fair tax estimation is : $ " + total);
                    break;
                }
                case 10 :{
                    System.out.println("KINDLY INPUT MONTHLY EXPENSES FOR THE MONTH:");
                    int spending = scanner.nextInt();
                    total = (spending * CONSTANT) - 842;
                    System.out.println("Your monthly fair tax estimation is  :$ " + total);
                    break;
                }
                case 11: {
                    System.out.println("KINDLY INPUT MONTHLY EXPENSES FOR THE MONTH:");
                    int spending = scanner.nextInt();
                    total = (spending * CONSTANT) - 682;
                    System.out.println("Your monthly fair tax estimation is :$ " + total);
                    break;
                }
                case 12 : {
                    System.out.println("KINDLY INPUT MONTHLY EXPENSES FOR THE MONTH:");
                    int spending = scanner.nextInt();
                    total = (spending * CONSTANT) - 929;
                    System.out.println("Your monthly fair tax estimation is  :$ " + total);
                    break;
                }
                case 13:{
                    System.out.println("KINDLY INPUT MONTHLY EXPENSES FOR THE MONTH:");
                    int spending = scanner.nextInt();
                    total = (spending * CONSTANT) - 769;
                    System.out.println("Your monthly fair tax estimation is  :$ " + total);
                    break;
                }
                case 14: {
                    System.out.println("KINDLY INPUT MONTHLY EXPENSES FOR THE MONTH:");
                    int spending = scanner.nextInt();
                    total = (spending * CONSTANT) - 1016;
                    System.out.println("Your monthly fair tax estimation is  :$ " + total);
                    break;
                }
                case 15 :{
                    System.out.println("KINDLY INPUT MONTHLY EXPENSES FOR THE MONTH:");
                    int spending = scanner.nextInt();
                    total = (spending * CONSTANT) - 856;
                    System.out.println("Your monthly fair tax estimation is  :$ " + total);
                    break;
                }
                case 16: {
                    System.out.println("KINDLY INPUT MONTHLY EXPENSES FOR THE MONTH:");
                    int spending = scanner.nextInt();
                    total = (spending * CONSTANT) - 1103;
                    System.out.println("Your monthly fair tax estimation is  :$ " + total);
                    break;
                }
            }
            System.out.println("FAIR TAX CALCULATOR,ENTER 1 TO CONTINUE OR PRESS 0 TO STOP:");
            stopper = scanner.nextInt();

            }

            }

        }


