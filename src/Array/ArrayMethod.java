package Array;

public class ArrayMethod {

    int length;

    public String getReverString(String St)
    {
      length = St.length();
      String reverString = "";

        for (int i = 0; i <= length - 1; i++) {

        reverString = reverString + St.charAt(length - 1 - i);
    }

        return reverString;
    }


    //2. Reverse an array
    public void getReverseArray(int[] Re) {
        length = Re.length;
        int[] ReversArray = new int[length];

        for (int i = 0; i <= length - 1; i++)
        {
            ReversArray[i] = Re[length - 1 - i];

            System.out.print(ReversArray[i]+" ");

        }
    }


    //3.Add all number in a given array
    public int getArraySum(int[] Su) {

        int sum = 0;
        length = Su.length;
        int[] lenAr = new int[length];

        for (int i = 0; i <= length - 1; i++) {


            sum = sum + Su[i];
        }
        return sum;

    }

    //4.Sort an array
    public void getSortArray(int[] Sort) {

        length = Sort.length;
        int min;
        int temp=0;

        for (int i = 0; i<length; i++) {

            min = i;
            for (int j = i + 1; j < length; j++) {

                if (Sort[j] < Sort[min]) {

                    min = j;
                }

            }
            temp = Sort[i];
            Sort[i] = Sort[min];
            Sort[min] = temp;
        }

        for(int k=0;k<Sort.length;k++){

            System.out.print(Sort[k]+" ");
        }
    }


    //5 Find Average of a given array
    public double getAverageArray(int[] Avar) {

        length = Avar.length;
        double Average = 0;
        int sum = 0;
        for (int i = 0; i < length; i++) {

            sum = sum + Avar[i];
            Average = sum / length;
        }
        return Average;
    }

    //6 Find maximum number in an given array
    public int getMaximumNum(int[] Max) {

        int Maximum = Max[0];
        length = Max.length;
        for (int i = 0; i < length; i++) {

            if (Max[i] > Maximum) {

                Maximum = Max[i];

            }

        }
        return Maximum;
    }

    //7 Find minimum number in an given array
    public int getMinimumNum(int[] Min) {

        int Minimum = Min[0];
        length = Min.length;

        for (int i = 0; i < length; i++) {

            if (Min[i] < Minimum) {

                Minimum = Min[i];

            }

        }
        return Minimum;


    }

    //8 Create abbreviation for any string

    public String getAbbreviation(String GM) {

        length= GM.length();

        String AV = "";

        for (int i = 0; i < length; i++) {

            AV = AV + GM.charAt(i);
        }

        return AV;

    }


    //9 Given two array,one contains Names and another one marks
    public void DisplayNamesMarks(String[] Names, int [] Marks) {


        length = Names.length;
        String[] Displayname = new String[length];

        int lengthM = Marks.length;
        int[] Displaymarks = new int[length];

        for (int i = 0; i < length; i++) {

            Displayname[i]=Names[i];

            for (int j = 0; j <lengthM; j++) {

                Displaymarks[i] = Marks[i];
            }

            System.out.println(Displayname[i]+": "+Displaymarks[i]);

        }

    }
}
