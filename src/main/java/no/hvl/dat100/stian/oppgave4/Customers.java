
package no.hvl.dat100.stian.oppgave4;

import no.hvl.dat100.stian.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Konstruktør
    public Customers(int size) {
        customers = new Customer[size];
    }

    // b) Teller antall kunder
    public int countNonNull() {

        int count = 0;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                count++;
            }
        }

        return count;
    }

    // c) Henter kunde med gitt kundenummer
    public Customer getCustomer(int customer_id) {

        Customer c = null;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null &&
                customers[i].getCustomer_id() == customer_id) {

                c = customers[i];
                break;
            }
        }

        return c;
    }

    // d) Legger til kunde
    public boolean addCustomer(Customer c) {

        boolean inserted = false;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = c;
                inserted = true;
                break;
            }
        }

        return inserted;
    }

    // e) Sletter kunde med gitt kundenummer
    public Customer removeCustomer(int customer_id) {

        Customer c = null;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null &&
                customers[i].getCustomer_id() == customer_id) {

                c = customers[i];
                customers[i] = null;
                break;
            }
        }

        return c;
    }

    // f) Returnerer tabell med alle kunder
    public Customer[] getCustomers() {

        Customer[] result = new Customer[countNonNull()];

        int index = 0;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                result[index] = customers[i];
                index++;
            }
        }

        return result;
    }
}
