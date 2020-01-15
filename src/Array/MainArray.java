package Array;

import java.util.Arrays;

public class MainArray {

    public static void main(String[] args) {

       Array reverse=new Array();

        //1 Reverse a string
        String result = reverse.Revestring("Sample");
        System.out.println("Revers String :"+result);


        //2 Reverse an array
        int[] array = {25,15, 3, 2, 40};
        int[] reverseArray=reverse.getReverseArray(array);
        System.out.println("Reverse an array element"+ Arrays.toString(reverseArray));


        //3  Add all numbers in a given array
        int [] su={20,10,40,44};
        System.out.println("The Sum of all  array element :"+reverse.getArraySum(su));


        //4 Sort an Array
        int[] sort={20,10,40,44};
        int[] sortSrray= reverse.getSortArray(sort);
        System.out.println("Sort an array element in ascending oder:"+(Arrays.toString(sortSrray)));

        // 5 Find Average of a given array
        int[] average={20,10,40,44};
        System.out.println("The Average value of an array: "+reverse.getAverageArray(average));

        //6 Find maximum number in given array
        int[] maximum={20,10,40,44};
        System.out.println("The maximum number of an array: "+reverse.getMaximumNum(maximum));

        //7 Find minimum number in given array
        int[] minimum={20,10,40,44};
        System.out.println("The Minimum number of an array: "+reverse.getMinimumNum(minimum));

        //8 Create abbreviation for any String
        String abbreviation=reverse.getAbbreviation("Happy New Year");
        System.out.println("Happy New Year Abbreviation form is:"+abbreviation);

        //9 Given two arrays,one contains total marks of 11 students of a class,second array contains their names in same order as marks-array
        int [] marks={90,89,91,67,87,88,93,90,100,81,54};

        String [] names={"Happy","Peach","Jesse","Katlin","Amir","Donald","Steaven","Vicky","Hannah","David","Gia"};
        reverse.DisplayNamesMarks(names,marks);

        //10 Create a method to Add numbers from 0 to given number,and return the result
        System.out.println("Add all number Upto given number is: "+reverse.AddUpto(5));


    }
}
