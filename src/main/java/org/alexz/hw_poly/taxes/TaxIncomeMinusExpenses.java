package org.alexz.hw_poly.taxes;

public class TaxIncomeMinusExpenses extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (debit - credit) * 15 / 100;
        return Math.max(0, tax);
    }
}
