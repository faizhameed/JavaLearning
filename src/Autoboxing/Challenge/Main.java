package Autoboxing.Challenge;

import java.util.ArrayList;

/*
THe Customer will have a name and an ArrayList of transactions containing Double wrapper elements
- A customer's transaction can be a credit which means a positive amount, or it can be a debit, a negative amount.

The Bank will have  a name and an ArrayList of customers.
- THe bank should add a new customer, they're not yet already in the list.
- The bank class should allow a customer to add a transaction to an existing customer
- This class should also print a statement, that includes the customer name and the transaction amounts. The method should use unboxing
 */




record Customer(String name, ArrayList<Double> transactions){
    public Customer(String name, double initialDeposit){
    this(name.toUpperCase(),new ArrayList<Double>(500));
   addTransaction(initialDeposit);
    }
    public void addTransaction(double amt){
        transactions.add(amt);
    }
}

public class Main {
    public static void main(String[] args) {
        String name="Muhammed Sheikh";
        Customer muhammed  =  new Customer(name,1000);
        System.out.println(muhammed);
        Bank bank  = new Bank("SBI");
        String customerName = "Faiz Hameed";
        bank.addCustomers(customerName,550000);
        System.out.println(bank);
        bank.addTransaction(customerName,40000);
        bank.addTransaction(customerName,45000);
        bank.addTransaction(customerName,-2300);
        bank.addTransaction(customerName,-12000);
        bank.printStatement(customerName);
        bank.printStatement(name); // as this is not onboarded to bank as a customer
        bank.addCustomers(name,90000);
        bank.addTransaction(name,60000);
        bank.addTransaction(name,32000);
        bank.addTransaction(name,-312);
        bank.addTransaction(name,-67420);
        bank.printStatement(name);

    }
}

class Bank{
    private String name;
    private  ArrayList<Customer> customers =  new ArrayList<>(5000);

    public Bank(String name){
        this.name= name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName){
        for(var customer:customers) {
        if(customer.name().equalsIgnoreCase(customerName)){
            return   customer;
            }
        }
        System.out.printf("Customer (%s) wasnot found %n", customerName);
        return null;
    }
    public void addCustomers(String customerName,double initialDeposit){
        // check if customer is already present
        if(getCustomer(customerName)==null){
            // no customer present lets create one
            Customer customer = new Customer(customerName,initialDeposit);
            customers.add(customer);
            System.out.println("New Customer added: "+customerName);
        }
    }

    public void addTransaction(String customerName, double transactionAmt){
        Customer customer =   getCustomer(customerName);
        if(customer!=null){
            customer.addTransaction(transactionAmt);
            System.out.println("Transactions added for "+ customerName + " amount: "+transactionAmt );
        }else{
            System.out.println("No customer found!");
        }
    }
    public void printStatement(String customerName){
        Customer customer =  getCustomer(customerName);
        if(customer==null){
            return;
        }
        System.out.println("_".repeat(30));
        System.out.println("Customer Name: "+customer.name());
        System.out.println("Transactions:");
        for (double statementAmt:customer.transactions()){
            System.out.printf("$%10.2f (%s)%n",statementAmt, statementAmt<0?"debit":"credit");
        }
    }


}