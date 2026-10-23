package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {
        for(int i = 0; i<24; i++){
            System.out.println(prices[i] + " NOK");
        }

    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        for(int i= 0; i<24; i++){
            System.out.println(usage[i]+" kWh");
        }

    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;

        for(double i: usage){
            sum += i;
        }
        // TODO

        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;

        for (int i = 0; i<24; i++){

            price+= usage[i]*prices[i];
        }

        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    private static double getSupport(double usage, double price) {

        double support = 0;

        if (usage*price >= THRESHOLD){
            support = usage*price*PERCENTAGE;
        }

        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;

        for(int i = 0; i<24; i++){
            double[] sum = new double[24];
            sum[i] = usage[i]*prices[i];

            if (sum[i]>= THRESHOLD){
                support += sum[i]*PERCENTAGE;
            }
        }

        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;

        for(double i: usage){
            price += i*NORGESPRIS_KWH;
        }

        return price;
    }

    // g) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;

        for(double i: usage){
            if(i>temp_max){
                temp_max = i;
            }
        }

        return temp_max;
    }

    public static double findAvgPower(double[] usage) {

        double average = 0;

        for(double i:usage){
            average += i/24;
        }
        return average;
    }
}