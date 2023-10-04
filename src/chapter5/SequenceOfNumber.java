package chapter5;

public class SequenceOfNumber {
    public static void main(String[] args) {
        int total = 0;
        for(int number = 1;number <= 100;number++){
            total += number;
            System.out.println(number + " "+ total);
        }
    }

}
