package Array;

public class Array {

    int  length;

    // No 1.Reverse a String
    public String Revestring(String st) {

        length = st.length();
        String reverString = "";

        for (int i = 0; i <= length - 1; i++) {

            reverString = reverString + st.charAt(length - 1 - i);
        }

        return reverString;
    }


    //No 2.Reverse an array
    public int[] getReverseArray(int[] re) {

        length = re.length;

        int[] reversArray = new int[length];

        for (int i = 0; i <= length - 1; i++)
        {
            reversArray[i] = re[length - 1 - i];

        }
        return reversArray;
    }


    //Add all number in a given array
    public int getArraySum(int[] su) {

        int sum = 0;
        length = su.length;
        int[] lenAr = new int[length];

        for (int i = 0; i <= length - 1; i++) {


            sum = sum + su[i];
        }

        return sum;

    }

    //Sort an array
    public int[] getSortArray(int[] sort) {

        length = sort.length;
        int min;
        int temp=0;

        for (int i = 0; i<length; i++) {

            min = i;
            for (int j = i + 1; j < length; j++) {

                if (sort[j] < sort[min]) {

                    min = j;
                }

            }
            temp = sort[i];
            sort[i] = sort[min];
            sort[min] = temp;
        }
        return sort;
    }


    //5 Find Average of a given array
    public double getAverageArray(int[] average) {

        length = average.length;
        double averageR = 0;
        int sum = 0;
        for (int i = 0; i < length; i++) {

            sum = sum + average[i];
        }

        averageR = sum / length;
        return averageR;
    }

    //6 Find maximum number in an given array
    public int getMaximumNum(int[] max) {

        int maximum = max[0];
        length = max.length;
        for (int i = 0; i < length; i++) {

            if (max[i] > maximum) {

                maximum = max[i];
            }

        }
        return maximum;
    }


    //7 Find minimum number in an given array
    public int getMinimumNum(int[] min) {

        int minimum = min[0];
        length = min.length;

        for (int i = 0; i < length; i++) {

            if (min[i] < minimum) {

                minimum = min[i];

            }

        }
        return minimum;


    }

    //8 Create abbreviation for any string

    public String getAbbreviation(String abbre) {

        String abbreviationS ="";

        String[] a= abbre.split(" ");

        for (int i = 0; i < a.length; i++) {

            abbreviationS=abbreviationS+a[i].charAt(0);
        }
         return abbreviationS;
    }


    //9 Given two array,one contains Names and another one marks
    public void DisplayNamesMarks(String[] names, int [] marks) {


        int maxi= marks[0];

        for (int i = 0; i < names.length; i++) {

            System.out.println( names[i] +" "+ marks[i]);


            for (int j = 0; j <length; j++) {

                if (maxi < marks[i]) {
                    maxi = marks[i];

                }
            }
        }

        System.out.println("The maximum number in array is :"+maxi);


    }

    //10 Create a method to add numbers from 0 to given number and return the result from method.
    public int AddUpto(int value) {

        int Add=0;
        for(int i=0; i<=value; i++){

            Add=Add+i;
        }

        return Add;

    }

}




