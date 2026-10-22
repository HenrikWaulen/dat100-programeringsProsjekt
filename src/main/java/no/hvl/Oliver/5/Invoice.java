package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;


    }

    public void computeAmount() {
        double sum = 0;
        switch (c.getAgreement()){
            case SPOTPRICE, POWERSUPPORT ->{
                int dag = 0;
                int time = 0;
                for(double[] i : usage){
                    time = 0;
                    for(double j : i){
                        double temp = j*prices[dag][time];

                        if(c.getAgreement()== PowerAgreementType.SPOTPRICE || (c.getAgreement() == PowerAgreementType.POWERSUPPORT && temp <= 0.9375)){
                            sum+=temp;
                        } else{
                            sum += temp*0.1;
                        }
                        time++;

                    }
                    dag++;
                }

            }

            case NORGESPRICE ->{
                for(double[] i : usage){
                    for(double j: i){
                        sum += j*0.5;
                    }

                }

            }
        }
        amount = sum;
        System.out.println(amount);
    }


    public void printInvoice() {

        double totalUsage = 0;
        System.out.println("Customer number: "+c.getCustomer_id()+"\nName: "+c.getName()+"\nEmail: "+c.getEmail()+"\nAgreement plan: "+c.getAgreement());
        for(double[] i: usage){
            for(double j: i){
                totalUsage += j;
            }
        }
        System.out.print("\nTotal usage ");
        System.out.printf("%.2f kWh", totalUsage);
        System.out.print("\nTotal price ");
        System.out.printf("%.2f NOK",amount);
    }
}
