package chapter5;

public class ContinueStatement {
    public static void main(String[] args) {
        for(int count = 1;count <= 10;count++){
            if(count == 5){
                count +=1;
            }
            System.out.print(count + " ");
        }
    }
}
