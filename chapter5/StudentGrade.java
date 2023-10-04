package chapter5;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        for(int number = 1;number <= 5; number++){
            System.out.println("Enter your name: ");
            String name = scanner.next();
            System.out.println("Enter your letter grade: ");
            String letter = scanner.next();
            System.out.println("Enter your score grade: ");
            int score = scanner.nextInt();
            switch (score / 10) {
                case 10, 9 -> countA+=1;
                case 8 -> countB+=1;
                case 7 -> countC+=1;
                case 6 -> countD+=1;
                default -> System.out.println("you failed");
            }
        }
        System.out.println(countA + " number of student got A");
        System.out.println(countB + " number of student got B");
        System.out.println(countC + " number of student got C");
        System.out.println(countD + " number of student got D");
    }

}
