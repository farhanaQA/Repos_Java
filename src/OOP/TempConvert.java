package OOP;

public class TempConvert {


    public double Covertkelvin(double cel){

        double kelvin=cel +273.15;
        return kelvin;

    }
    public double ConvertFarenheit(double celcius){

        double farenhit=(celcius*9/5)+32;
        return farenhit;
    }
    public  double ConvertCelcius(double kelvin){

        double celcius=kelvin-273.15;
        return celcius;
    }
    public double ConvertFareheit(double kel){

        double farenheit=(kel-273.15)*9/5+32;
        return farenheit;

    }
}


