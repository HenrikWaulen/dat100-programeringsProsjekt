package no.hvl.dat100.javel.oppgave1;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        DailyPower.printPowerPrices(DayPowerData.powerprices_day);
        System.out.println("==============");
        System.out.println();

        System.out.println("==============");
        DailyPower.printPowerUsage(DayPowerData.powerusage_day);
        System.out.println("==============");
        System.out.println();

        System.out.println("==============");
        System.out.println(DailyPower.computePowerUsage(DayPowerData.powerusage_day)+" kWh");
        System.out.println("==============");
        System.out.println();


        System.out.println("==============");
        System.out.printf("%.2f NOK", DailyPower.computeSpotPrice(DayPowerData.powerusage_day, DayPowerData.powerprices_day));
        System.out.println("\n==============");

        System.out.println("==============");
        System.out.println();
        System.out.println("==============");
        System.out.println();
        /*
        TODO

         Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}
