package org.alexz.hw_poly.taxes;

public class TaxIncome extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        return debit * 6 / 100;
    }
}
