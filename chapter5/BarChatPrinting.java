package chapter5;

import java.util.Random;
import java.util.Scanner;

public class BarChatPrinting {
    public static void main(String[] args) {
        Random random = new Random();
        for(int count = 1;count <= 5;count++){
            int input = random.nextInt(1,30);
            for(int counts = 1; counts <= input ;counts++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
