package org.example;

import java.util.Scanner;

public class Atm {

    private double balance;
    private long atmPin;
   private Scanner scn;

    public Atm(){
       this.atmPin=1;
       this.scn= new Scanner(System.in);
    }


    public void checkPin(){
        System.out.println("Enter Your Atm Pin");
        Scanner scn = new Scanner(System.in);
        int enteredPin=scn.nextInt();
        if(enteredPin!=atmPin){
            System.out.println("Invalid Pin ... ");
            return;
        }
        menu();
    }

    public void  checkBalance(){
        System.out.println("Your Balance Is : " +balance);
        exit();

    }
    public void withdrawBalance(){
        System.out.println("Enter amount to withdraw: ");
        double withdrawAmount=scn.nextDouble();
        if(withdrawAmount<=0){
            System.out.println("Please enter a valid amount.");
            withdrawBalance();
        }else if(withdrawAmount>balance){
            System.out.println("Insufficient balance, Your Bank Balance IS: "+balance);
            exit();
        }else{
            balance-=withdrawAmount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
            exit();
        }

    }

    public void depositeBalance(){
        System.out.println("Enter amount to deposit: ");
        double depositedAmmount=scn.nextDouble();
        if(depositedAmmount<=0){
            System.out.println("Please enter a valid amount.");
            depositeBalance();
        }
        balance+=depositedAmmount;
        System.out.println("Deposit successful. New balance: ₹" + balance);
        exit();
    }
    public void exit(){
        System.out.println("Enter your Choice");
        System.out.println("1. you want to Exit. ");
        System.out.println("2. Go To Home Page. ");

        Scanner scn = new Scanner (System.in);
        int number =scn.nextInt();
        if(number==1){
            return;
        }else{
            menu();
        }
    }

    public void menu(){
        System.out.println("WelCome To Indian Bank.");
        System.out.println("Enter your Choice ");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdhraw Money");
        System.out.println("3. Deposite Money");
        System.out.println("4. Exit");
        int number=scn.nextInt();
        if(number ==1){
             checkBalance();
        }else if (number ==2){
             withdrawBalance();
        }else if(number==3){
            depositeBalance();
        }else if(number==4){
            System.out.println("Thank you for using Indian Bank ATM. Goodbye!");
        }else{
            System.out.println("Invalid option. Please try again.");
        }

    }

}
