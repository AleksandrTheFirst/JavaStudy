package org.alexz.hw_poly;

import org.alexz.hw_poly.taxes.TaxIncome;
import org.alexz.hw_poly.taxes.TaxIncomeMinusExpenses;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Первая компания", new TaxIncome());
        company.shiftMoney(10_000);
        company.payTaxes();
        company.setTaxSystem(new TaxIncomeMinusExpenses());
        company.shiftMoney(10_000);
        company.payTaxes();
    }
}
