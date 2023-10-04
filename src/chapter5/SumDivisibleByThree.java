package chapter5;

public class SumDivisibleByThree {
        public static void main(String[] args) {
            int total = 0;
            for(int number = 1;number <= 30 ;number ++){
                if(number % 3 == 0){
                    total += number;

                }
            }
            System.out.println("The total of the sum of the number divisible my 3 is :  "+  total);
        }
    }

