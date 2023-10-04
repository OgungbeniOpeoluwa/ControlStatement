package chapter5;

public class DiamondPrinting {
    public static void main(String[] args) {
        for(int count = 1;count < 10;count++){
            for(int counts = count; counts < 10 ; counts ++){
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
        for(int count = 1;count <= 10;count++){
            for(int counts = 1; counts < count  ; counts ++){
                System.out.print("  ");
            }
            for(int counts = count; counts <=10 ; counts ++){
                System.out.print("* ");
            }
           for(int counts = count; counts < 10 ; counts ++){
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }
}
