package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {
int i =1;
       for (double[] dag : usage){
           System.out.print("Dag" + i + " :" );
               DailyPower.printPowerUsage(dag);
           i++;
           }
        System.out.println();
       }



    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        int i=1;
        for (double[] dag : prices){
            System.out.print("Dag" + i + " :" );
            DailyPower.printPowerPrices(dag);
            i++;
            }
        System.out.println();
        }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

       for(double[] dag : usage){
           sum+=DailyPower.computePowerUsage(dag);
       }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {
       double usage = 0;
       int i=0;
       while(true){
               usage +=DailyPower.computePowerUsage(powerusage[i]);
               i++;
               if(usage>threshold){return true;}
           if(i>=powerusage.length){break;}
           }
        return(false);

    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;
        int i=0;
        int j=0;
        for (double[] days : usage){
            for(double hours : days){
            price+=hours*prices[j][i];
            i++;
        }j++;
        i=0;}
        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;
        int i=0;
        for (double []day : prices){
            support+=DailyPower.computePowerSupport(usage[i], day) ;
            i++;}

     return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

for(double[]day:usage){
    price+=DailyPower.computeNorgesPrice(day);
}

        return price;
    }
}
