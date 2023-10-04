package chapter5;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        for(int number = 1; number <= 12;number++) {
            christmasSong(number);
        }
    }



    public static void christmasSong(int number) {
        switch (number) {
            case 1 -> {
                System.out.println("On the first day of christmas,my true love sent to me");
                lyrics(1);
                System.out.println();
            }
            case 2 -> {
                System.out.println("on the second day of christmas, my true love sent to me");
                lyrics(2);
                System.out.println();
            }
            case 3 -> {
                System.out.println("on the third day of christmas, my true love sent to me ");
                lyrics(3);
                System.out.println();
            }
            case 4 -> {
                System.out.println("on the fourth day of christmas, my true love sent to me");
                lyrics(4);
                System.out.println();
            }
            case 5 -> {
                System.out.println("on the fifth day , my true love sent to me");
                lyrics(5);
                System.out.println();
            }
            case 6 -> {
                System.out.println("on the sixth day, my true love sent to me");
                lyrics(6);
                System.out.println();
            }
            case 7 -> {
                System.out.println("on the seventh day, my true love sent to me");
                lyrics(7);
                System.out.println();
            }
            case 8 -> {
                System.out.println("on the eight day, my true love sent to me");
                lyrics(8);
                System.out.println();
            }
            case 9 -> {
                System.out.println("on the ninth day, my true love sent to me");
                lyrics(9);
                System.out.println();
            }
            case 10 -> {
                System.out.println("on the tenth day, my true love sent to me");
                lyrics(10);
                System.out.println();
            }
            case 11 -> {
                System.out.println("on the eleventh day, my true love sent to me");
                lyrics(11);
                System.out.println();
            }
            case 12 -> {
                System.out.println("on the twelve day, my true love sent to me");
                lyrics(12);

            }
        }
    }


    public static void lyrics(int days) {
        switch (days) {
            case 12:
                System.out.println("Twelve drummers drumming");

            case 11:
                System.out.println("Eleven pipers piping");

            case 10:
                System.out.println("Ten lords a-leaping");

            case 9:
                System.out.println("Nine ladies dancing");

            case 8:
                System.out.println("Eight maids a-milking");

            case 7:
                System.out.println(" Seven swans a-swimming");

            case 6:
                System.out.println("Six geese a-laying");

            case 5:
                System.out.println("Five golden rings");

            case 4:
                System.out.println("Four calling birds ");

            case 3:
                System.out.println("Three french hens");

            case 2:
                System.out.println("Two turtle doves, and ");

            case 1:
                System.out.println("and a partridge in a pear tree");

        }


    }


}


