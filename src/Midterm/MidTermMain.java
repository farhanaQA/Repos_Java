package Midterm;

import java.util.Arrays;

public class MidTermMain {

    public static void main(String[] args) {

      MidTerm missingArray=new MidTerm();
      MidTerm speed=new MidTerm();

     int[] Array = {1, 3, 5, 4, 2, 7};
     System.out.println("No.1:Find the missing positive integer number:"+missingArray.getFindPositiveInteger(Array));


     int[] intarray={32,14,24,94,24,56,148,24,78,24};
     int []newArray=missingArray.getRemoveAnElement(intarray,24);
     System.out.println("NO.2:Remove an element from an areay:"+Arrays.toString(newArray));


     int speedlimit=75;
     int points=speed.getcheckpoints(88);

     if(speed.lincence())
         System.out.println("You points is now  "+points);
     else
         System.out.println("you lost your license: ");


    }
}