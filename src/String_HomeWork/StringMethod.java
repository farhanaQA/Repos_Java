package String_HomeWork;

public class StringMethod {

    public static void main(String[] args) {


        System.out.println("Task no 1.");
        //1 String myStatementt ="I am a good programmer"
        String  myStatement="I am a good programmer";
        System.out.println("1.String myStatemnt: "+myStatement);

        //Extract "programmer" string from myStatement
        System.out.println(("2.Extract \"programmer\" string from myStatement is: "+myStatement.substring(11,22)));

        System.out.println("3.Display the total number of word in the statement ");
        String[] displayWord=myStatement.split(" ");
        System.out.println(displayWord);
        System.out.println(displayWord.length);

        System.out.println("4.Replace all the 'r' characters with 'f' characters: "+myStatement.replace('r','f'));
        System.out.println();

        System.out.println("Task no 2");
        //1.Store your name in a String variable.
        String myName="Farhana";
        System.out.println("1.Store your in a String Variable Name: "+myName);

        //Calculate the length of your name,without length() method of String class
        System.out.println("2.Calculate the length of your name,without length() method: "+myName.codePointCount(0,7));

        System.out.println();
        System.out.println("Task No 3 ");
        //String[] names={"Mohammad","John","Ferdous","Abul","Ratna","Mareeha","Ruslan","Himani";
        System.out.println("1.Strings []names={\"Mohammad\",\"John\",\"ferdous\",\"Abul\",\"Ratna\",\"Mahreeha\",\"Ruslan\",\"Himani\"}");
        String[] names=new String[8];
        names[0]="Mohammad";
        names[1]="John";
        names[2]="Ferdous";
        names[3]="Abul";
        names[4]="Ratna";
        names[5]="Mareeha";
        names[6]="Ruslan";
        names[7]="Himani";

        //verify if "JOHN" is present at index 1.
        System.out.println("2.Verify if JOHN is present at index 1: "+("JOHN".contains(names[1])));

        System.out.println();

        System.out.println("Task no 4");
        //Store Frist name of my 5 friends in an array
        System.out.println(" Store Frist name of my 5 Friends in an array: ");
        String friendNames[]=new String[5];
        friendNames[0]="Rupa";
        friendNames[1]="Happy";
        friendNames[2]="Toma";
        friendNames[3]="Doly";
        friendNames[4]="Akhi";

        //1.length of the array
        System.out.println("1.length of the Array: "+friendNames.length);

        //2.print name written on 3rd position(hint :2nd index)
        System.out.println("2.Print name written on 3rd Position : "+friendNames[2]);

        //3.Name of each friend/colleague
        System.out.println("3.Name of each my friends: "+friendNames[0]+" "+friendNames[1]+" " + friendNames[2]+ " "+friendNames[3]+" "+friendNames[4]);

        //4.Does name 2nd position,start with "A"
        System.out.println("4.Does name 2nd postion start with  A : "+friendNames[2].startsWith("A"));

       int div=10/2;
        System.out.println(div);

        int di=10%2;
        System.out.println(di);

    }
}
