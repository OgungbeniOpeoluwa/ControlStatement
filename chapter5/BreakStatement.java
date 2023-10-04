package chapter5;

public class BreakStatement {
    public static void main(String[] args) {
        int count = 0;
        for(count = 1;count <= 10;count ++){
            System.out.print(count + " ");
            if(count == 5){
                count = count +6;
            }

        }
    }
}
