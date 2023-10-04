package chapter5;

public class TrianglePrintingProgam {
    public static void main(String[] args) {
        for(int count = 1; count <= 10; count++) {
            for (int counter = 1; counter <= count; counter++) {
                System.out.print("* ");
            }
            for (int counter = count ; counter <= 10; counter++) {
                System.out.print("  ");
            }
            for(int counter = count; counter <= 10;counter++) {
                System.out.print("* ");
            }
            for (int counter = 1; counter <= count; counter++) {
                System.out.print("  ");
            }
            for (int counter = 1; counter <= count; counter++) {
                System.out.print("  ");
            }
            for(int counter = count; counter <= 10;counter++) {
                System.out.print("* ");
            }
            for(int counter = count; counter <= 10;counter++) {
                System.out.print("  ");
            }
            for(int counter = 1; counter <= count;counter++) {
                System.out.print("* ");
            }

                    System.out.println();
        }

    }
}
