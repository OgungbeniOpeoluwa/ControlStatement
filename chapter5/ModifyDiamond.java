package chapter5;

import java.util.Scanner;

public class ModifyDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a any odd number within 1 to 19: ");
        int input = scanner.nextInt();
        for(int count = 1;count < input;count++){
            for(int counts = count; counts < input ; counts ++){
                System.out.print("  ");
            }
            for(int counts = 1; counts <= count ; counts ++){
                System.out.print("* ");
            }
            for(int counts = 1; counts < count ; counts ++){
                System.out.print("* ");
            }
            System.out.println("  ");
        }
        for(int count = 1;count <= input ;count++){
            for(int counts = 1; counts < count  ; counts ++){
                System.out.print("  ");
            }
            for(int counts = count; counts <=input ; counts ++){
                System.out.print("* ");
            }
            for(int counts = count; counts < input ; counts ++){
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }

}
