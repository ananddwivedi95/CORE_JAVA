package com.anand;

import CreateBankAccount.CreateBankAccount;
import Transection.BankTransection;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BankApplication {

    public static void main(String[] args) {

        CreateBankAccount create= new CreateBankAccount();
        BankTransection bt= new BankTransection(create);

        boolean bankEntry=true;
        while(bankEntry)
        {
            System.out.println("=====Welcome in SBI bank====");
            System.out.println("1 create new account");
            System.out.println("2 withdraw");
            System.out.println("3 deposit ");
            System.out.println("4 check balance ");
            System.out.println("5 exit");
            System.out.println("Enter your choice: ");

            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1->create.createAccount();
                case 2->bt.withdraw();
                case 3->bt.deposit();
                case 4->bt.checkbalance();
                case 5->bankEntry=false;
                default-> System.out.println("Invalid choice");
            }
        }
    }
}