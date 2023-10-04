package chapter5;

public class Pie {
    public static void main(String[] args) {
        final int constant  = 4;
        int count = 0;
        double result = 0;
        for(int number = 1;number <= 200000;number +=2){
            if(count % 2 == 1){
                result -= (double) constant/number;
            }
            else if(count % 2  == 0){
                result += (double)constant/number;
            }
            count++;
            System.out.println(String.format("%.5f",result));

        }
    }
}
