
package no.hvl.dat100.stian.oppgave5;

import no.hvl.dat100.stian.oppgave3.Customer;
import no.hvl.dat100.stian.oppgave3.PowerAgreementType;

public class Invoice {

    private Customer c;
    private String month;
    private double[][] usage;
    private double[][] prices;

    private double amount;

    // a) Konstruktør
    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;
    }

    // b) Beregne strømpris
    public void computeAmount() {

        amount = 0;

        for (int day = 0; day < usage.length; day++) {
            for (int hour = 0; hour < usage[day].length; hour++) {

                double powerUsage = usage[day][hour];
                double price = prices[day][hour];

                if (c.getAgreement() == PowerAgreementType.SPOTPRICE) {
                    amount += powerUsage * price;
                } else if (c.getAgreement() == PowerAgreementType.NORGESPRICE) {
                    amount += powerUsage * 0.50;
                } else if (c.getAgreement() == PowerAgreementType.POWERSUPPORT) {
                    amount += powerUsage * (price - Math.max(0, price - 0.9375) * 0.90);
                }
            }
        }
    }

    // c) Skrive ut faktura
    public void printInvoice() {

        double totalUsage = 0;

        for (int day = 0; day < usage.length; day++) {
            for (int hour = 0; hour < usage[day].length; hour++) {
                totalUsage += usage[day][hour];
            }
        }

        System.out.println(c);
        System.out.println();

        System.out.println("Month: " + month);
        System.out.printf("Usage: %10.2f kWh%n", totalUsage);
        System.out.printf("Amount: %9.2f NOK%n", amount);
    }
}
