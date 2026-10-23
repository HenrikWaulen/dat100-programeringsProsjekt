
package no.hvl.dat100.stian.oppgave5;

import no.hvl.dat100.stian.oppgave3.Customer;
import no.hvl.dat100.stian.oppgave3.PowerAgreementType;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        // Oppretter kunder
        Customer c1 = new Customer("Charlie Rose", "charlie@example.com",
                1003, PowerAgreementType.POWERSUPPORT);

        Customer c2 = new Customer("Diana Prince", "diana@example.com",
                1004, PowerAgreementType.NORGESPRICE);

        Customer c3 = new Customer("Ethan Hunt", "ethan@example.com",
                1005, PowerAgreementType.SPOTPRICE);

        // Eksempelpriser: 2 kr per kWh for alle timer
        double[][] prices = new double[31][24];

        for (int day = 0; day < prices.length; day++) {
            for (int hour = 0; hour < prices[day].length; hour++) {
                prices[day][hour] = 2.0;
            }
        }

        // Oppretter fakturaer
        Invoice i1 = new Invoice(c1, "January",
                CustomerPowerUsageData.usage_month_customer1, prices);

        Invoice i2 = new Invoice(c2, "January",
                CustomerPowerUsageData.usage_month_customer2, prices);

        Invoice i3 = new Invoice(c3, "January",
                CustomerPowerUsageData.usage_month_customer3, prices);

        // Behandler alle fakturaene
        Invoice[] invoices = {i1, i2, i3};

        Invoices.processInvoices(invoices);
    }
}
