
package no.hvl.dat100.stian.oppgave4;

import no.hvl.dat100.stian.oppgave3.Customer;
import no.hvl.dat100.stian.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        // a) Oppretter en kundetabell med plass til 5 kunder
        Customers customers = new Customers(5);

        // Oppretter kunder
        Customer c1 = new Customer("Alice Smith", "alice@example.com",
                1001, PowerAgreementType.SPOTPRICE);

        Customer c2 = new Customer("Bob Johnson", "bob@example.com",
                1002, PowerAgreementType.NORGESPRICE);

        Customer c3 = new Customer("Charlie Rose", "charlie@example.com",
                1003, PowerAgreementType.POWERSUPPORT);

        Customer c4 = new Customer("Diana Prince", "diana@example.com",
                1004, PowerAgreementType.NORGESPRICE);

        Customer c5 = new Customer("Ethan Hunt", "ethan@example.com",
                1005, PowerAgreementType.POWERSUPPORT);

        // d) Legger til kunder
        customers.addCustomer(c1);
        customers.addCustomer(c2);
        customers.addCustomer(c3);
        customers.addCustomer(c4);
        customers.addCustomer(c5);

        // b) Tester countNonNull
        System.out.println("Antall kunder: " + customers.countNonNull());

        // c) Tester getCustomer
        System.out.println();
        System.out.println("Henter kunde 1002:");
        System.out.println(customers.getCustomer(1002));

        // e) Tester removeCustomer
        System.out.println();
        System.out.println("Sletter kunde 1003:");
        System.out.println(customers.removeCustomer(1003));

        System.out.println();
        System.out.println("Antall kunder etter sletting: "
                + customers.countNonNull());

        // f) Tester getCustomers
        System.out.println();
        System.out.println("Alle kunder:");

        Customer[] alleKunder = customers.getCustomers();

        for (int i = 0; i < alleKunder.length; i++) {
            System.out.println(alleKunder[i]);
            System.out.println();
        }
    }
}
