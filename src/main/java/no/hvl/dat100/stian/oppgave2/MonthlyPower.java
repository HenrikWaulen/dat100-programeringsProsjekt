
package no.hvl.dat100.stian.oppgave2;

import no.hvl.dat100.stian.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for (int i = 0; i < usage.length; i++) {
            System.out.printf("Day %d:", i + 1);

            for (int j = 0; j < usage[i].length; j++) {
                System.out.printf("%.2f kWh ", usage[i][j]);
            }

            System.out.println();
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for (int i = 0; i < prices.length; i++) {
            System.out.printf("Day %d:", i + 1);

            for (int j = 0; j < prices[i].length; j++) {
                System.out.printf("%.2f kr ", prices[i][j]);
            }

            System.out.println();
        }
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                sum += usage[i][j];
            }
        }

        return sum;
    }

    // d) determine whether a given threshold in power usage
    // for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        double usage = 0;
        int i = 0;
        int j = 0;

        while (i < powerusage.length) {
            while (j < powerusage[i].length) {
                usage += powerusage[i][j];

                if (usage > threshold) {
                    return true;
                }

                j++;
            }

            j = 0;
            i++;
        }

        return false;
    }

    // e) compute spot price for the month
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                price += usage[i][j] * prices[i][j];
            }
        }

        return price;
    }

    // f) compute power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        for (int i = 0; i < usage.length; i++) {
            support += DailyPower.computePowerSupport(usage[i], prices[i]);
        }

        return support;
    }

    // g) compute Norgespris for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        for (double[] dayUsage : usage) {
            price += DailyPower.computeNorgesPrice(dayUsage);
        }

        return price;
    }
}
