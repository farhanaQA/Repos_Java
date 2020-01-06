package basic;

public class TempCalculate {

    public static void main(String[] args) {

        double fahrenheit=60;
        //calculate celsius and store in celsius variable
        //T(°C)=(68°F-32)*5/9=20°C
        double celsius=(fahrenheit-32)*5/9;
        System.out.println("Convert temp fahrenhite to celsius"+celsius+"\n");


        //Calculate kelvin value ans store in variable
        //T(K)=(60°F +459.67)*5/9=288.71K
        double kelvin =(fahrenheit+459.67)*5/9;
        System.out.println("Convert temp fahrenhite to kelvin:"+kelvin);
        System.out.println();

        double Celsius=70;
        //Calculate Kelvin value ans store in variable
        //T(k)=70+273.15
        double Kelvin=Celsius +273.15;
        System.out.println("Convert temperature Celsius to Kelvin :"+Kelvin);
        System.out.println();

         //Convert temp Celsius to Fahrenheit
        //T(F)=(70*9/5)+32
        double Farenheit=(Celsius*9/5)+32;
        System.out.println("Convert temperature Celsius to Farenheit :"+Farenheit);
        System.out.println();

        //Convert temp kelvin to celcius
        //T(°C)=343.5-273.15
        double Celcius= Kelvin-273.15;
        System.out.println("Convert temperature kelvin to Celcius "+Celcius);
        System.out.println();

        //Convert temp kelvin to fahrenheit
        //T(F)=(343.5-273.15)*9/5+32
        double fahrenhit=(Kelvin-273.15)*9/5+32;
        System.out.println("Convert temp kelvin to farenhite "+fahrenhit);




    }


}


