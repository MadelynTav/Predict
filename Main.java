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

        System.out.println("What is your favorite number? (Choose a number from 1-10)");
        System.out.println("I will use this number to predict your future");


//        si = input.next();
//
        while (again) {
//            n = input.nextInt();
//            System.out.println("You chose " + n + ". ");
//        continue;

            while (predict) {
                n = input.nextInt();
                System.out.println("You chose " + n + ". ");

                while (n < 10) {

                    if (n == 1) {
                        System.out.println("You will have many children to take care of. You will live a long life ");
//                    System.out.println("Would you like me to predict an alternate future? If so, choose another number");
//                    next = input.nextInt();
                        break;
                    } else if (n == 2) {
                        System.out.println("You will marry a person with many horses for your children");
//                    System.out.println("Would you like to choose another future?");
//                    next = input.nextInt();
                        break;
                    } else if (n == 3) {
                        System.out.println("You will move to Europe in a couple of years");
//                    System.out.println("Would you like to choose another future? (Y or N?");
//                    next = input.nextInt();
                        break;
                    } else if (n == 4) {
                        System.out.println("You will enjoy a very lavish old age with a beautiful home and car");
//                    System.out.println("Would you like to choose another future? (Y or N?");
//                    next = input.nextInt();
                        break;
                    } else if (n == 5) {
                        System.out.println("You will gain a lot of weight and become a Sumo Wrestler");
//                    System.out.println("Would you like to choose another future? (Y or N?");
//                    next = input.nextInt();
                        break;
                    } else if (n == 6) {
                        System.out.println("You will fall in love many times in many different ways");
//                    System.out.println("Would you like to choose another future? (Y or N?");
//                    next = input.nextInt();
                        break;
                    } else if (n == 7) {
                        System.out.println("You will have many friends like those in Sex And The City. You are lucky!");
//                    System.out.println("Would you like to choose another future? (Y or N?");
//                    next = input.nextInt();
                        break;
                    } else if (n == 8) {
                        System.out.println("You will move to California in order to cross the Mexican border illegally");
//                    System.out.println("Would you like to choose another future? (Y or N?");
//                    next = input.nextInt();
                        break;
                    } else if (n == 9) {
                        System.out.println("You will have a big Italian family and enjoy weekly family dinners");
//                    System.out.println("Would you like to choose another future? (Y or N?");
//                    next = input.nextInt();
                        break;
                    } else if (n == 10) {
                        System.out.println("You will have your own business");
//                    System.out.println("Would you like to choose another future? (Y or N?");
//                    next = input.nextInt();
                    }

                    else{
                        System.out.println("You must choose a number from 1-10.Choose a number");
                        n = input.nextInt();
                    }


                }
                Scanner run = new Scanner(System.in);
                System.out.println("Would you like me to predict another future for you? Choose a number.");



//                n = input.nextInt();
//                if (int i=0){
//                    again=true;
                }

            


            }


                }

            }


//            if (tryAgain.equalsIgnoreCase("Y")) {
//                predict = true;
//                continue;
//
//
//            } else if (tryAgain.equalsIgnoreCase("N")) {
//                System.out.print("Good luck!");
//                break;
//





//


//            while ((n >= 10) && (n <= 5));
//                System.out.println("You cannot veer too far off of your chosen path");
//                System.out.println("Please choose a smaller number");


//            while (si.equalsIgnoreCase("Y")) {
//                System.out.println("Which number would you like to choose?");
//                n = input.nextInt();





//
//








