package org.alexz.hw_abst;

public abstract class Account {

    abstract boolean add(long amount);
    abstract boolean pay(long amount);
    abstract boolean transfer(Account account, long amount);
    abstract long getBalance();
}
