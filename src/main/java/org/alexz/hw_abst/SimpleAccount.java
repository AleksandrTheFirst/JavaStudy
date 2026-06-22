package org.alexz.hw_abst;

public class SimpleAccount extends Account {
    private long balance = 0L;

    public SimpleAccount(long balance) {
        this.balance = balance;
    }

    @Override
    boolean add(long amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    boolean pay(long amount) {
        if (balance > 0 && amount > 0 && (balance - amount > 0)) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    boolean transfer(Account account, long amount) {
        if (account.getBalance() > 0 && amount > 0) {
            pay(amount);
            account.add(amount);
        }
        return false;
    }

    @Override
    long getBalance() {
        return balance;
    }
}
