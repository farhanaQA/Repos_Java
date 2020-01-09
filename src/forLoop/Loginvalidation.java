package forLoop;

import java.util.Scanner;

public class Loginvalidation {

    public static void main(String[] args) {

        //                                  TEST SCENARIO OF LOGIN VALIDATION

        //1.Verify user should be able to login with valid credentials
        //2.Verify user enter valid username and password then system display homepage
        //3.Verify User Enter invalid Username or password then allow user tries 4 more times to enter username and password
        //4.Verify user enter invalid username or password is equal 4 times then user account is locked for 10 min.
        //5.verify user can again try enter user name and password after 10min


        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your  UserName:");
        String actualUserName =input.nextLine();
        String expectedUserName="FarhanaBushra";

        System.out.println("Please  Enter your password: ");
        String actualPassWord=input.nextLine();
        String expectedPassword="farhana123";

        for(int i=0; i<5; i++) {

            if (!(actualUserName.equals(expectedUserName) && actualPassWord.equals(expectedPassword)) )    {

                int count = 5 - i;


                System.out.println(" you have " + count + " more tries ");
                System.out.println(" please enter valid user name: ");
                actualUserName = input.nextLine();

                System.out.println(" please enter valid  password ");
                actualPassWord = input.nextLine();

                if (i == 4)
                {
                    System.out.println(" your account is lock for 10min ");
                    System.out.println(" If you want to you can try again after 10min: ");
                }
            }

            else {
                System.out.println("Welcome your homepage: ");
                break;


                //Report: In this code i did not find any bug.
            }
        }
    }
}
