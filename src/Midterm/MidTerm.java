package Midterm;

public class MidTerm {

    private int points=12;


   //N0 1.create a method missing positive integer
    public int getFindPositiveInteger(int[] array){

        int missingInteger;
        int sum=0;
        for(int i=0;i<array.length;i++){

            sum=sum+array[i];
        }

        int sum1=0;

        for(int j=1;j<=7;j++)
        {
            sum1=sum1+j;
        }
          missingInteger=sum1-sum;

         return missingInteger;
    }

    //no 2. write a program to remove a spacific element from an array
     public int[] getRemoveAnElement(int[] intArray, int value) {

        int[] newArray = new int[intArray.length-1];
        for (int i = 0; i < intArray.length; i++) {

            if (intArray[i] == value) {
                newArray = new int[intArray.length - 1];

                for (int index = 0; index < i; index++) {
                    newArray[index] = intArray[index];
                }
                  for (int j = i; j < intArray.length - 1; j++) {
                    newArray[j] = intArray[j + 1];
                   }
                    break;
            }
        }

        return newArray;

    }

    //No.3 Traffic ticketing System.

    public boolean lincence( ){

        if(this.points>0){

            return true;
        }
        else
            return false;

    }
    public int getcheckpoints(int speed){

        if(speed<=70)
        {
            return 0;
        }
        int tempPoints=(speed-70)/5;
        points=points-tempPoints;

      return points;
}
}