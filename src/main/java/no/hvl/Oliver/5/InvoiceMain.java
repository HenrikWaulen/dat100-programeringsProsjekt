package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        Customer a = new Customer("Ole ivar", "Oisann@outlook.com",1,PowerAgreementType.NORGESPRICE);
        Customer b = new Customer("Ivar Olsen", "Ivarolsen@outlook.com",2,PowerAgreementType.SPOTPRICE);
        Customer c = new Customer("Nils Jonas", "Nilsjo@gmail.com",3,PowerAgreementType.POWERSUPPORT);

        Invoice ole = new Invoice(a,"fluff",CustomerPowerUsageData.usage_month_customer1,MonthPowerData.powerprices_month);
        Invoice dole = new Invoice(b,"fluff",CustomerPowerUsageData.usage_month_customer2,MonthPowerData.powerprices_month);
        Invoice doffen = new Invoice(c,"fluff",CustomerPowerUsageData.usage_month_customer3,MonthPowerData.powerprices_month);


        //ole.computeAmount();
        //dole.computeAmount();
        //doffen.computeAmount();
        //ole.printInvoice();

        Invoice[] invoices = {ole,dole,doffen};

        Invoices.processInvoices(invoices);
        /*
        TODO


         Write code that uses the methods implemented in the Invoice-classes

        */

    }
}
