package Transection;

import CreateBankAccount.CreateBankAccount;

public class Login {
    public  boolean credential(int aadhar , long account, CreateBankAccount create)
    {
        return create.account.containsKey(aadhar) && create.account.get(aadhar) == account;
    }
}
