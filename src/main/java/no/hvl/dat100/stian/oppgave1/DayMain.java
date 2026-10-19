package no.hvl.dat100.stian.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();


        System.out.printf("a)\n");
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println("\n");
        
        System.out.printf("b)\n");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println("\n");

        System.out.printf("c)\n");
        System.out.printf("%.2f kWh %n",
            DailyPower.computePowerUsage(powerusage_day));
        System.out.println("\n");

        System.out.printf("d)\n");
        System.out.printf("%.2f Nok %n",
            DailyPower.computeSpotPrice(powerusage_day, powerprices_day));
        System.out.println("\n");
        
        System.out.printf("f)\n");
        System.out.printf("%.2f Nok %n",
            DailyPower.computePowerSupport(powerusage_day, powerprices_day));
        System.out.println("\n");

        System.out.printf("g)\n");
        System.out.printf("%.2f Nok %n",
            DailyPower.computeNorgesPrice(powerusage_day));
        System.out.println("\n");

        System.out.printf("h)\n");
        System.out.printf("%.2f Nok %n",
            DailyPower.findPeakUsage(powerusage_day));
        System.out.println("\n");

        System.out.printf("i)\n");
        System.out.printf("%.2f Nok %n",
            DailyPower.findAvgPower(powerusage_day));
        System.out.println("\n");
    }
}
