package no.hvl.dat100.javel.oppgave4;
import java.util.Scanner;
import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {


    private Customer[] customers;
    int amount;

    // a) Complete constructor
    public Customers(int size) {
        customers = new Customer[size];
        amount = 0;

    }

    // b) count number of non-null references
    public int countNonNull() {


        int count = 0;
        for(Customer i: customers){
            if(i != null){
                count++;
            }
        }


        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        boolean funnet = false;
        int pos = 0;
        Customer c = null;

        while (!funnet) {
            if(pos == amount || pos < 0){
                funnet = true;
            } else {
                if (customers[pos].getCustomer_id() == customer_id) {
                    c = customers[pos];
                    funnet = true;
                } else {
                    pos++;
                }
            }
        }

        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;
        if(amount==customers.length || getCustomer(c.getCustomer_id()) !=null){
            System.out.println("oi noe gikk galt /:");
            return false;

            } else{
            customers[amount] = c;
            amount++;
            inserted = true;
            System.out.println("Ferdig!");
        }

        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        boolean deleted = false;
        Customer c = null;
        int pos = 0;

        while (!deleted) {
            if(pos > amount || pos < 0){
                deleted = true;
            } else {
                if (customers[pos].getCustomer_id() == customer_id) {
                    c = customers[pos];
                    customers[pos] = null;
                    amount--;
                    deleted = true;
                } else {
                    pos++;
                }
            }
        }

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        int pos = 0;
        Customer[] customers1 = new Customer[countNonNull()];
        for(Customer i : customers){
            if(i!=null) {

                customers1[pos] = i;
                System.out.println(i.toString());
                pos++;
            }
        }
        Customer[] customers = null;



        return customers;
    }
}
