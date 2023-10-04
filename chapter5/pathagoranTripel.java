package chapter5;

public class pathagoranTripel {
    public static void main(String[] args) {
        int result = 0;
        int product = 0;
        int result2 = 0;
        int number = 0;
        int counts = 0;
        int total = 0;
        for( number = 1; number <= 100;number++){
            result = square(number);
            for( counts = 1;counts <= 100;counts++) {
                product = square(counts);
                result2 = result + product;
                total = findSquare(result2);
                if(total == 0){
                    continue;
                }
                if(result2 / total == total ){
                    System.out.println(number + " " + " "+ counts+ " " + total);
                }
            }

        }


    }

    public static int square(int number){
        int product = 1;
        for(int count = 1;count <= 2; count++){
            product *=number;

        }
        return product;
    }
    public static int findSquare(int number){
        int total = 0;
        for(int number2 = 1; number2 <= number; number2++ ){
            if(number2 * number2 == number) {
                total = number2;
            }
        }
        return total;
    }
}
