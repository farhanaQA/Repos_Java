package forLoop;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {



        // No.1 Student Score,total possible Score

        int score=15;
        int maxScore=20;
        float percent=(score*100)/maxScore;
        System.out.println("you got a score "+percent+ " % ");

        if (percent>=100){
            System.out.println("your score is 'A+' ");
        }

        else if(percent>=90 && percent<99){
            System.out.println("your score is 'A' ");

        }
        else if(percent>=80 && percent<89){
            System.out.println("your grade is 'B'");}

        else if (percent>=70 && percent<79){
            System.out.println("your Grade is 'C' ");

        }
        else if(percent>=40 && percent<69) {
            System.out.println("your Grade is 'D' ");
        }

        else if(percent>=0 && percent<39) {
            System.out.println("your Grade is 'F' ");
        }
        else {
            System.out.println("you are Fail:");
        }


        //No 2. Write a logic that prints multiplication table of the provided number upoto ten

        Scanner Input =new Scanner(System.in);
        System.out.println("please enter any number to print multiplication table : ");
        int number=Input.nextInt();
        int result=0;

        for(int i=1;i<=10;i++) {

            result = number * i;
            System.out.println(number + " *" + i + " = " + result);
        }


        //No 3.Write a logic that check if a number is a Prime number

        Scanner input = new Scanner(System.in);
        System.out.println("please enter any number to find the Prime number: ");
        int Number = input.nextInt();
        int count = 0;

        for (int i=2; i<= Number-1; i++) {

            if (Number % i == 0) {

                count=count+1;
            }
        }
        if (count > 0) {

            System.out.println("the " + Number + " number is  not prime:");
        }

        else {
            System.out.println(" the " + Number + " number is prime:");

        }
    }
}
