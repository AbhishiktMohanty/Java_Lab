// Write a program to create an Account class containing acc no, balance as data members and disp() to display
// the details. Inherit it in Person class with all mentioned data members and functions. Person class also 
// has name and aadhar no as extra data members of its own. Override disp() function. Create 5 persons" details.

import java.util.Scanner;

class Account {
    protected int accNo;
    protected double balance;
    
    public Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
    
    public void disp() {
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    private String name;
    private long aadharNo;
    
    public Person(int accNo, double balance, String name, long aadharNo) {
        super(accNo, balance);
        this.name = name;
        this.aadharNo = aadharNo;
    }
    
    public void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar No: " + aadharNo);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Account No for Person " + (i+1) + ": ");
            int accNo = sc.nextInt();
            System.out.println("Enter Balance for Person " + (i+1) + ": ");
            double balance = sc.nextDouble();
            System.out.println("Enter Name for Person " + (i+1) + ": ");
            String name = sc.next();
            System.out.println("Enter Aadhar No for Person " + (i+1) + ": ");
            long aadharNo = sc.nextLong();
            persons[i] = new Person(accNo, balance, name, aadharNo);
        }
        
        System.out.println("Details of all persons: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Person " + (i+1) + ": ");
            persons[i].disp();
        }
    }
}