package nyc.c4q.madelyntav;


import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int n;
        int next;
        String tryAgain;
        boolean again = true;
        boolean predict = true;


        while (predict) {
            System.out.println("What is your favorite number? (Choose a number from 1-10)");
            System.out.println("I will use this number to predict your future");
            n = input.nextInt();
            System.out.println("You chose " + n + ". ");

            while (n < 11) {

                if (n == 1) {
                    System.out.println("You will have many children to take care of. You will live a long life ");

                    break;
                } else if (n == 2) {
                    System.out.println("You will marry a person with many horses for your children");

                    break;
                } else if (n == 3) {
                    System.out.println("You will move to Europe in a couple of years");

                    break;
                } else if (n == 4) {
                    System.out.println("You will enjoy a very lavish old age with a beautiful home and car");

                    break;
                } else if (n == 5) {
                    System.out.println("You will gain a lot of weight and become a Sumo Wrestler");

                    break;
                } else if (n == 6) {
                    System.out.println("You will fall in love many times in many different ways");

                    break;
                } else if (n == 7) {
                    System.out.println("You will have many friends like those in Sex And The City. You are lucky!");

                    break;
                } else if (n == 8) {
                    System.out.println("You will move to California in order to cross the Mexican border illegally");

                    break;
                } else if (n == 9) {
                    System.out.println("You will have a big Italian family and enjoy weekly family dinners");

                    break;
                } else if (n == 10) {
                    System.out.println("You will have your own business");
                    break;
                }


            }
            Scanner run = new Scanner(System.in);
            String reRun;

            if (n < 11) {
                System.out.println("Would you like me to predict another future for you? (Y or N).");
                reRun = run.next();
                if (reRun.equalsIgnoreCase("Y")) {
                    predict = true;
                } else if (reRun.equalsIgnoreCase("N")) {
                    predict = !true;
                }
                    else{
                        System.out.println("N/A");
                }
            }

            else {
                System.out.println("I cannot change your future, you are doomed if you are unable to follow rules. Goodbye. Enjoy your fortune!");
                break;
            }
        }

    }
}










