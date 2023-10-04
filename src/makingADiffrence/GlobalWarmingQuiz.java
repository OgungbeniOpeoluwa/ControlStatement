package makingADiffrence;

import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question());
        System.out.println("Will you like to try again : if yes enter(1) else(0):");
        int stopper = scanner.nextInt();
        while(stopper != 0){
            System.out.println(question());
            System.out.println("Will you like to try again : if yes enter(1) else(0):");
            stopper = scanner.nextInt();
        }


    }


    public static String question() {
        Scanner scanner = new Scanner(System.in);
        String a = "c";
        String b = "a" ;
        String c = "c";
       String d = "c";
        String e = "b";
        int result = 0;
        String answer = " ";

        for (int count = 1; count <= 5; count++) {
            switch (count) {
                case 1: {
                    System.out.println("""
                            1. What is the primary greenhouse gas responsible for global warming
                            a. Oxygen
                            b.Nitrogen
                            c. carbon dioxide(Co2);
                            d. Hydrogen""");
                    System.out.println("Please choose the correct answer by indicating the letters: ");
                    String input = scanner.next();
                    if (input.equals(a)) {
                        result += 1;
                    }
                    break;
                }
                case 2: {
                    System.out.println("""
                            2. Which is a consequence of global warming ?
                            a. Rising sea level
                            b. Decreased frequency of Hurricanes
                            c. Reduced temperature Worldwide
                            d. Increased Snowfall in polar regions
                            """);
                    System.out.println("Please choose the correct answer by indicating the letters: ");
                    String input = scanner.next();
                    if (input.equals(b)) {
                        result += 1;
                    }
                    break;
                }
                case 3: {
                    System.out.println("""
                            3. What is the Primary Cause of Global Warming?
                            a.Natural climate Variability
                            b. Solar Activity
                            c. Human activities, such has burning fossil fuels
                            d. Volcanic eruptions """);
                    System.out.println("Please choose the correct answer by indicating the letters: ");
                    String input = scanner.next();
                    if (input.equals(c)) {
                        result += 1;
                    }
                    break;

                }
                case 4: {
                    System.out.println("""
                            4.What is one way individuals can reduce their carbon footprint and
                              help combat global warming ? 
                            a. using plastics product
                            b. increasing energy consumption
                            c. reducing, reusing and recycling
                            d.  Driving alone in gas-guzzzling cars""");
                    System.out.println("Please choose the correct answer by indicating the letters: ");
                    String input = scanner.next();
                    if (input.equals(d)) {
                        result += 1;
                    }
                    break;
                }
                case 5: {
                    System.out.println("""
                            5. What are some potential consequences of global warming, as highlighted by climate change advocates?
                            a) Increased crop yields and agricultural productivity
                            b) Rising sea levels and coastal flooding
                            c) More stable weather patterns and fewer extreme events
                            d) Decreased global temperatures""");
                    System.out.println("Please choose the correct answer by indicating the letters: ");
                    String input = scanner.next();
                    if (input.equals(e)) {
                        result += 1;
                    }
                    break;

                }
            }
        }
        System.out.println(result);

        if(result == 5){
            answer = "Excellent";
        }
        else if (result == 4){
            answer = "very Good";
        }
        else{
            answer = ("""
                    Time to brush up on your knowledge of global warming..check this website out
                                            Websites for Climate Change Advocates:
                                            1. Environmental Defense Fund
                                            2. Climate Reality Project
                                            3. global warming policy foundation""");
        }

        return answer;
    }
}
