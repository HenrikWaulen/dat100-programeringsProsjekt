
package no.hvl.dat100.stian.oppgave3;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        // Oppretter et Customer-objekt
        Customer customer = new Customer(
                "Alice Smith",
                "alice@example.com",
                1001,
                PowerAgreementType.SPOTPRICE
        );

        // Tester toString
        System.out.println(customer);
        System.out.println();

        // Tester get-metodene
        System.out.println(customer.getName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getCustomer_id());
        System.out.println(customer.getAgreement());

        System.out.println();

        // Tester set-metodene
        customer.setName("Ola Nordmann");
        customer.setEmail("ola@example.com");
        customer.setCustomer_id(1002);
        customer.setAgreement(PowerAgreementType.NORGESPRICE);

        // Skriver ut kunden etter endringene
        System.out.println(customer);
    }
}
