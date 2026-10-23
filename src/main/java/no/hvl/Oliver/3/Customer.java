package no.hvl.dat100.javel.oppgave3;

public class Customer {

    private String name, email;
    private PowerAgreementType agreement;
    private int customer_id;


    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {

        this.name = name;
        this.email = email;
        this.agreement = agreement;
        this.customer_id = customer_id;

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public PowerAgreementType getAgreement(){
        return agreement;
    }
    public int getCustomer_id(){
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setAgreement(PowerAgreementType agreement) {
        this.agreement = agreement;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return customer_id + ": " + name + " " + email + " " + agreement;
    }

}
