package Transection;

import CreateBankAccount.CreateBankAccount;

import java.math.BigDecimal;
import java.util.Scanner;

public class BankTransection implements Transection{
    Scanner sc;
    CreateBankAccount create;
    Login login;
    long account;
    int password;
    public BankTransection(CreateBankAccount create)
    {
        this.create=create;
        sc=new Scanner(System.in);
        login= new Login();
    }
    @Override
    public void deposit() {
        System.out.println("enter the account number");
        account=sc.nextLong();
        System.out.println("enter the password");
        password=sc.nextInt();
        boolean check=login.credential(password,account,create);
        if(check)
        {
            System.out.println("===Login SuccessFull===");
            System.out.println("===Enter the amount to deposit===");
            BigDecimal depositAmount=sc.nextBigDecimal();
            create.amount.put(account,create.amount.get(account).add(depositAmount));
            System.out.println("Amount deposited successfully");
            System.out.println("your current balance is "+create.amount.get(account));
        }
        else {
            System.out.println("account number or password is incorrect or not exist");
        }
        System.out.println("thank you for service");
    }

    @Override
    public void withdraw() {

        System.out.println("enter the account number");
        account=sc.nextLong();
        System.out.println("enter the password");
        password=sc.nextInt();
        //credential check
        boolean check=login.credential(password,account,create);
        if(check)
        {
            System.out.println("====Login SuccessFull====");
            System.out.println("==Enter withdrew amount===");
            BigDecimal withdrewAmount=sc.nextBigDecimal();

            BigDecimal currentAmount= create.amount.get(account);
            if(currentAmount.compareTo(withdrewAmount) >= 0)
            {
                create.amount.put(account,create.amount.get(account).subtract(withdrewAmount));
                System.out.println("Amount withdrawn successfully");
                return;
            }
            else {
                System.out.println("Insufficient balance");
            }
        }
        else {
            System.out.println("account number or password is incorrect or not exist");
        }
        System.out.println("thank you for service");
    }

    @Override
    public void checkbalance() {
        System.out.println("enter the account number");
        account=sc.nextLong();
        System.out.println("enter the aadhar number");
        password=sc.nextInt();
        boolean check=login.credential(password,account,create);
        if(check)
        {
            System.out.println("====Login SuccessFull====");
            System.out.println("your current balance is "+create.amount.get(account));
        }
        else {
            System.out.println("account number or password is incorrect or not exist");
        }
        System.out.println("thank you for service");
    }

}
