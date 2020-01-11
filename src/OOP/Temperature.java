package OOP;

public class Temperature {

    public static void main(String[] args) {


        TempConvert temp=new TempConvert();

        //Convert temperature celsius to Kelvin
        double celciousToK =temp.Covertkelvin(45);
        if(celciousToK>0){
            System.out.println("Convert temperature celcius to kelvin: "+celciousToK+"°");
        }


        //Convert temperature   Celsius to farenheit
        double celciousToFar=temp.ConvertFarenheit(40);
        if(celciousToFar> 40){
            System.out.println("farenheit value is " +celciousToFar+"° "+ " ,its too hot outside: ");

        }

        //Convert temperature kelvin to celsius
        double kelvinToCel=temp.ConvertCelcius(300);
        if(kelvinToCel< 280){
            System.out.println("Convert temperature kelvin To Celcius "+ kelvinToCel +"° ");
        }


        //Convert temperature kelvin to farenheit
        double kelvinTofar=temp.ConvertFareheit(320);
        if(kelvinTofar>100)
        {
            System.out.println("farenheit value is "+kelvinTofar+"°"+", its too hot outside  : ");
        }
    }


    }

