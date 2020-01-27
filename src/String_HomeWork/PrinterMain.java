package String_HomeWork;

public class PrinterMain {

    public static void main(String[] args) {

        Printer print=new Printer();
         print.printPages(5,true);
         print.getcheckLevelOfToner();
         print.setTonerLevel(100);
         print.printPages(5,false);
         print.getcheckLevelOfToner();
         print.printPages(10,true);
        print.getcheckLevelOfToner();


}
}