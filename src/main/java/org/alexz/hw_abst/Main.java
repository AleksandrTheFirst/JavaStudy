package org.alexz.hw_abst;

public class Main {
    public static void main(String[] args) {
        Account account = new SimpleAccount(10_000);
        account.add(1_000);
        System.out.println(account.getBalance());
        account.pay(2_000);
        System.out.println(account.getBalance());

        Account newAccount = new CreditAccount(50_000);
        newAccount.add(1_000);
        System.out.println(newAccount.getBalance());
        newAccount.transfer(account, 10_000);
        System.out.println(newAccount.getBalance());
        System.out.println(account.getBalance());

        account.transfer(newAccount, 5_000);
        System.out.println(newAccount.getBalance());
        System.out.println(account.getBalance());
    }
}
