package OOP;

public class Temperature {

    public static void main(String[] args) {


        TempConvert temp=new TempConvert();

        //Convert temperature celsius to Kelvin
        double celciousToK =temp.Covertkelvin(45);
        System.out.println("Convert temperature celcius to kelvin: "+celciousToK+"°");


        //Convert temperature   Celsius to farenheit
        double celciousToFar=temp.ConvertFarenheit(40);
        System.out.println("Convert temperature  celcius to farenheit:" +celciousToFar+"° ");


        //Convert temperature kelvin to celsius
        double kelvinToCel=temp.ConvertCelcius(300);
        System.out.println("Convert temperature kelvin To Celcius "+ kelvinToCel +"° ");



        //Convert temperature kelvin to farenheit
        double kelvinTofar=temp.ConvertFareheit(320);
        System.out.println("Convert temerature kelvin to farenheit :"+kelvinTofar+"° : ");

    }




}