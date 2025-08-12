package CreateBankAccount;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CreateBankAccount {

    public HashMap<Integer , Long> account= new HashMap<>();
    public HashMap<Long, BigDecimal> amount= new HashMap<>();
    Scanner sc=new Scanner(System.in);

    public void createAccount()
    {
        System.out.println("=====enter your name====");
        sc.nextLine();
        String name=sc.nextLine();

        System.out.println("====enter your dob=====");
        String dob=sc.nextLine();

        System.out.println("====enter your aadhar number=====");
        int aadhar=sc.nextInt();

        if(account.containsKey(aadhar))
        {
            System.out.println("Account number "+account.get(aadhar));
            System.out.println("Account already exists");
            return;
        }
        else
        {
            long min12 = 1_000_000_000_000L;   // smallest 12-digit
            long max12 = 9_999_999_999_999L;   // largest 12-digit
            long random12 = ThreadLocalRandom.current().nextLong(min12, max12 + 1);
            account.put(aadhar,random12);
            amount.put(random12, BigDecimal.valueOf(0));

        }
        System.out.println(name+"Account created successfully");
        System.out.println("your account number is "+account.get(aadhar));
        System.out.println("thank you for service");
    }
}
