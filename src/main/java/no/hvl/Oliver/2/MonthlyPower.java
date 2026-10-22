package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {
        int day = 1;
        for(double[] i: usage){
            System.out.print("Day "+day+": ");
            for(double j: i){
                System.out.print(j+"kWh, ");

            }
            System.out.println();
            day++;
        }

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        int day = 1;
        for (double[] i : prices) {
            System.out.print("Day " + day + ": ");
            for (double j : i) {
                System.out.print(j + "kr, ");

            }
            System.out.println();
            day++;
        }
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for(double[] i:usage){
            for(double j: i){
                sum+= j;
            }

        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;
        int time = 0;
        int dag = 0;

        while(!exceeded){
            usage += powerusage[dag][time];
            if(usage>=threshold){
                exceeded=true;
            }
            time++;
            if(time>=24){
                dag++;
                time = 0;
            }
        }

        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;
        int dag = 0; // siden usage og prices har like mange elementer
        for(double[] i: usage){
            int time = 0;
            for(double j: i){
                price += j*prices[dag][time];
                time++;
            }
            dag++;
        }
        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;
        int dag = 0;

        for(double[]i : usage){
            int time = 0;
            for(double j:i){
                double pris = j*prices[dag][time];
                if(pris >=0.9375){
                    support += pris*0.9;
                }
                time++;
            }
            dag++;
        }

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;
        double norgesPris = 0.5;

        for(double[] i : usage){
            for(double j: i){
                price+=j*norgesPris;
            }
        }

        return price;
    }
}
