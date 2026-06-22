package org.alexz.hw_abst;

public class CreditAccount extends Account {
    private long limit = 0L;
    private long balance = 0L;

    public CreditAccount(long limit) {
        this.limit = limit;
        this.balance = limit;
    }

    @Override
    boolean add(long amount) {
        if (amount > 0 && balance < limit && (amount + balance < limit)) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    boolean pay(long amount) {
        if (balance > 0 && amount > 0 && (balance - amount < limit)) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    boolean transfer(Account account, long amount) {
        if (balance > 0 && amount > 0 && (balance - amount < limit)) {
            pay(amount);
            account.add(amount);
            return true;
        }
        return false;
    }

    @Override
    long getBalance() {
        return balance;
    }
}
