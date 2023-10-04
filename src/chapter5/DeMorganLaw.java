package chapter5;
public class DeMorganLaw {
    public static void main(String[] args) {
        int x = 5;
        int y = 9;
        int a = 10;
        int b = 5;
        int g = 2;
        int i = 16;
        int j = 8;
        if (!(x < 5) && !(y >= 7)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        if (!(a == b) || !(g != 5)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        if (!((x <= 8) && (y > 4))){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        if (!((i > 4) || (j <= 6))){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        System.out.println("Equivalent");

        if ((x >= 5) && (y < 7)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        if ((a  != b) || (g == 5)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        if (((x > 8) && (y <= 4))){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        if (((i <= 4) || (j > 6))){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}
