package Array;

public class MainArrayMethod {


    public static void main(String[] args) {


    ArrayMethod Revers=new ArrayMethod();

    //1 Reverse a string
    String result = Revers.getReverString("Simple");
    System.out.println("Revers String :"+result);

    String GM="Good Morning";

    //2 Reverse an array
    int[] Array = {25,15, 3, 2, 40};
    System.out.println("Reverse an array element");
    Revers.getReverseArray(Array);

    //3  Add all numbers in a given array
    int [] Su={20,10,40,44};
    System.out.println("\n"+"The Sum of all  array element :"+Revers.getArraySum(Su));

    //4 Sort an Array
    int[] Sort={20,10,40,44};
    System.out.println("Sort an array element in ascending oder: ");
    Revers.getSortArray(Sort);


    // 5 Find Average of a given array
    int[] AverageA={20,10,40,44};
    System.out.println("\n"+"The Average value of an array: "+Revers.getAverageArray(AverageA));


    //6 Find maximum number in given array
    int[] Maximum={20,10,40,44};
    System.out.println("The maximum number of an array: "+Revers.getMaximumNum(Maximum));


    //7 Find minimum number in given array
    int[] Minimum={20,10,40,44};
    System.out.println("The Minimum number of an array: "+Revers.getMinimumNum(Minimum));


    //8 Create abbreviation for any String
    String SA=Revers.getAbbreviation("Good Morning");
    System.out.println("Abbreviation for String Good Morning: "+(SA.charAt(0)+""+SA.charAt(5)));


    //9 Given two arrays,one contains total marks of 11 students of a class,second array contains their names in same order as marks-array
    int [] Marks={50,56,78,89,56,74,33,54,76,90,82};

    String [] Names={"Sara","Toma","Doly","Runa","Mitu","Nitu","Shmu","Kona","Tani","Moni","Ritu"};
    Revers.DisplayNamesMarks(Names,Marks);



}}
