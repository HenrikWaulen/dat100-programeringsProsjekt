package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {
int i=0;
        for (double pris : prices){

            System.out.print(pris +";");}
        if (i%6==0){
            System.out.println();
            i++;
        }
    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {
        int i=0;
        for (double hours : usage){

            System.out.print(hours+";");}
        if (i%6==0){
            System.out.println();
            i++;
        }
    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;

        for (double hours : usage){
            sum+=hours;
        }
        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;
int i=0;
        for (double hours : usage){
           price+=hours*prices[i];
           i++;
        }
        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    private static double getSupport(double usage, double price) {
        price -= THRESHOLD;
        double support = 0;
if (price>support){
    support = price*PERCENTAGE*usage;
        }
        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;
        int i=0;
for (double hour : prices){
    if (hour>THRESHOLD){support+=getSupport(usage[i], hour) ;}
    i++;
}


        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;

       for(double kwh : usage){
           price += kwh*0.5;
       }

        return price;
    }

    // h) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;

        for (double max : usage){
            if(max>temp_max){temp_max = max;}
        }

        return temp_max;
    }

    public static double findAvgPower(double[] usage) {

        double average = 0;
int i =0;
        for (double timen : usage){
            i++;
            average +=timen;
        }

        return average/i;
    }
}