package no.hvl.dat100.javel.oppgave3;

public class Customer {

    private String name;
   private String email;
    private int customer_id;
    private PowerAgreementType agreement;
    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {

        this.name=name;
        this.email=email;
        this.customer_id=customer_id;
        this.agreement=agreement;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public int getCustomer_id(){
        return this.customer_id;
    }
    public  PowerAgreementType getAgreement(){
        return this.agreement;
    }
    String setName(String name){
       return this.name=name;
    }
    String setEmail(String email){
        return this.email=email;
    }
    int setCustomer_id(int customer_id){
        return this.customer_id=customer_id;
    }
    PowerAgreementType setAgreement(PowerAgreementType agreement){
        return this.agreement=agreement;
    }

    @Override
    public String toString() {
      String  toString=name + "\n" + email+ "\n" + customer_id+ "\n" +agreement;
        return toString;
    }



}
