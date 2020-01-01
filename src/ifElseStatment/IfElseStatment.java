package ifElseStatment;

import java.util.Scanner;

public class IfElseStatment {

    public static void main(String[] args) {


        //HomeWork: menu
        System.out.println("No 1. item select from menu :");
        String mixMenus[] = {"meat", "salad", "Chicken", "carrot", "bean", "fish", "shrimp"};
        int lengthOfmenu = mixMenus.length;

        String[] vaggieMenu = {"salad", "carrort", "bean"};
        int lengthofVagMenu = vaggieMenu.length;
        String[] noinVegMenu = {"meat", "shrimp", "chicken"};
        int lengthOfNonVegMenu = noinVegMenu.length;
        boolean isGuestOneVegan = true;
        boolean isGuestTwoVegan = true;

        if (isGuestOneVegan && isGuestTwoVegan) {
            System.out.println("we offer you  only vagan dishes: " + vaggieMenu[lengthofVagMenu - 1] + "," + vaggieMenu[lengthofVagMenu - 2] + "," + vaggieMenu[lengthofVagMenu - 3]);
        } else if (isGuestOneVegan || isGuestTwoVegan) {

            System.out.println("some vaggies option for you : " + vaggieMenu[lengthofVagMenu - 1] + "," + vaggieMenu[lengthofVagMenu - 2] + ", " + vaggieMenu[lengthofVagMenu - 3]);
        } else {
            System.out.println("you can choose anyting from the manu: " + mixMenus[lengthOfmenu - 1] + " ," + mixMenus[lengthOfmenu - 2] + ", " + mixMenus[lengthOfmenu - 3] + " ," + mixMenus[lengthOfmenu - 4] + "," + mixMenus[lengthOfmenu - 5] + "," + mixMenus[lengthOfmenu - 6] + "," + mixMenus[lengthOfmenu - 7]+"\n");
        }


        //2. Driver Controller
        System.out.println("No 2.Driver Controller ");
        char mode = 'D';
        String parkingType = "parallel";
        if (mode == 'p' && parkingType == "parallel") {
            System.out.println("I am on " + mode + " mode and can park " + parkingType + " between two car:");
        } else if (mode == 'D' ) {

            System.out.println("I am on " + mode + " mode i can drive " +"SnowType" +" or "+  "SportType "+ "or "+"RegularType"+"\n");

        } else if (mode == 'N') {
            System.out.println("I am on " + mode + " mode i can put car in car wash station:"+"\n");
        }
          else if (mode == 'R' && parkingType == "reverse") {
            System.out.println("I am on " + mode + " mode and parking type is " + parkingType + " and car will activate back camera");
        }
          else {
            System.out.println("Invalid mode type ,please Check your car mode:"+"\n");
        }



        //3.Store a number in an int variable.
        System.out.println("No 3.Store a number in an int variable:");
        int number = 61;
        int reminder;
        reminder=number%15;
        if (number % 15 == 0) {
            System.out.println(" The number " +number+ " is divided by 15 "+"\n");

        } else {
            System.out.println(" The reminder is " + reminder+"\n");

        }




        //4.Store your name in a varivale
        System.out.println("No 4 .store your name in a variable:");
        String names = "Farhana Bushra";

        if (names.length() >= 8) {
            System.out.println("replace the all 'a' to 'A " + names.replace('a', 'A')+"\n");
        } else{
            System.out.println(names.toUpperCase()+"\n");
    }



        //5.Create  an array of 5 int values.calculate the avarage of those 5 values
        System.out.println("No 5.Create  an array of 5 int values and calculate the avarage of those 5 values");
        int Number [] = new int[5];
        Number[0]=22;
        Number[1]=34;
        Number[2]=50;
        Number[3]=64;
        Number[4]=75;

        double avarage;
        int result;
        result=Number[0]+Number[1]+Number[2]+Number[3]+Number[4];
        avarage=result/5;
        System.out.println("the Avarage value of all five Numbers:"+avarage);

        if(avarage>25)

        {
            System.out.println(" Here is all value of array 0 index to last index: " + Number[0] + " ," + Number[1] + " ," + Number[2] + " ," + Number[3] + " ," + Number[4]+"\n");
        }

        else{
            System.out.println(" Here is all value of array last index to 0 index: "+Number[4]+" ,"+Number[3]+" ,"+Number[2]+" ,"+Number[1]+" ,"+Number[0]+"\n");


            }



        /*Create a Supermarket item finder
        take an input from user and based on the input  */
        System.out.println("No 6.Create a Supermarket item finder");
        Scanner input=new Scanner(System.in);
        String item;
        System.out.println("please Enter your item name whatever you want to buy:");
        item=input.next();


        switch(item)

        {

        case "milk":
        case "Egg":
            System.out.println(" your item " + item + " is aisleNo One ");
            break;

        case "Donuts":
        case "Orange":
            System.out.println(" your item " + item + " is aisleNo Two");
            break;

        case "apple":
        case "Diapers":
            System.out.println(" your item " + item + " is aisle no Three");
            break;

        case "Frozen Pizza":
        case "French Fries":
            System.out.println(" your item " + item + "is aisle no Seven");
            break;

        case "Candy":
            System.out.println(" your item is " + item + "is aisle no Eight");
            break;

        default:
            System.out.println(" Sorry your item is Out of Stock ");
            break;

    }

    }
}
