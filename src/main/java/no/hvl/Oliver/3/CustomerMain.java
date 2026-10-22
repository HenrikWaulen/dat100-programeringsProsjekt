package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();



        Customer a = new Customer("Ole Ivar","Oisann@hotmail.com",1,PowerAgreementType.NORGESPRICE);

        System.out.println(a.toString());

        a.setCustomer_id(2);
        System.out.println(a.getCustomer_id());

        /*
        TODO


         Write code that creates a Customer object and teste the methods implemented in the class

        */
    }
}
