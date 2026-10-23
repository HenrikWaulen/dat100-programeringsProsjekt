package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customer a = new Customer("Ole ivar","Oisann@hotmail.com",1,PowerAgreementType.NORGESPRICE);
        Customer b = new Customer("Ivar Olsen", "Island@outlook.com",2,PowerAgreementType.SPOTPRICE);


        Customers fi = new Customers(5);

        System.out.println(fi.countNonNull());
        fi.addCustomer(a);
        fi.addCustomer(b);
        System.out.println(fi.countNonNull());
        System.out.println(fi.getCustomer(2));
        System.out.println(fi.getCustomers());

        /*
        TODO

         Write code that uses and tests the methods implemented in the Customers class

        */

    }
}
