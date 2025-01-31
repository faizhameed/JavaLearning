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


/*
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
        Customer muhammed  =  new Customer("Muhammed Sheikh",1000);
        System.out.println(muhammed);
        Bank bank  = new Bank("SBI");
        String customerName = "Faiz";
        bank.addCustomers(customerName,550000);
        System.out.println(bank);
        bank.addTransaction(customerName,40000);

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
    

}