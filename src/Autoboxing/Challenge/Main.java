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
public class Main {
    public static void main(String[] args) {
        Customer customer_1  =  new Customer("Faiz");
        Bank sbi =  new Bank("SBI");
        sbi.addCustomer(customer_1);
        sbi.addTransactions(customer_1,24.1);
        System.out.printf("Transactions for customer %s %n",customer_1.getName());
        System.out.println(sbi.getTransactions(customer_1));

    }
}

class Customer {
    private String name;



    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    public void addTransaction(Double amount){
        transactions.add(amount);
        System.out.println("Transaction added successfully");
    }
}

class Bank {
    private String bankName;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
        System.out.printf("Customer %s successfully added %n", customer.getName());
    }

    public ArrayList<Double> getTransactions(Customer c){
        return  c.getTransactions();
    }

    public void addTransactions(Customer c, Double amt){
        c.addTransaction(amt);
    }
}