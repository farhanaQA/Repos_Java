package String_HomeWork;

public class Printer {

    private  int tonerLevel;
    private int amountOfPaper=100;

    public void setTonerLevel(int toner) {
        if (toner > 0 && toner <= 100) {
            System.out.println("Initial tonel level is "+(tonerLevel=toner));
        }
        else{
            System.out.println("low toner,please Add more toner ");
        }
    }
    public int printPages(int printPage, boolean isSinglePage)
    {
        if (printPage > 100) {
            System.out.println("Maximum pages to print is 100");

        } else if (amountOfPaper == 0) {
            System.out.println("No paper in the printer.");
        }
        else if (isSinglePage) {
            amountOfPaper = amountOfPaper - printPage;
            tonerLevel = tonerLevel - printPage;
            System.out.println("Number of pages printed " + printPage);

        } else {
            amountOfPaper = amountOfPaper - (printPage / 2);
            tonerLevel= tonerLevel/2- printPage;
            System.out.println("Number of pages printed " + printPage / 2);
        }
        return printPage;
    }
    // check the updated tonerlevel
    public int getcheckLevelOfToner() {

        System.out.println("updated toner level is "+tonerLevel);
        return this.tonerLevel;
    }
}

