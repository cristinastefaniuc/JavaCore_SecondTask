package com.endava.javacore.task2.task9;

public class TestSavingsAccount {
    public static void main(String []args) {
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        SavingsAccount saver3 = new SavingsAccount(-2000.0);

        SavingsAccount.modifyInterestRate(0.04);

        saver1.setSavingsBalance(saver1.getSavingsBalance() + saver1.calculateMonthlyInterest());
        saver2.setSavingsBalance(saver2.getSavingsBalance() + saver2.calculateMonthlyInterest());
        saver3.setSavingsBalance(saver3.getSavingsBalance() - saver3.calculateMonthlyInterest());

        System.out.println(saver1.toString());
        System.out.println(saver2.toString());
        System.out.println(saver3.toString());

        SavingsAccount.modifyInterestRate(0.05);

        saver1.setSavingsBalance(saver1.getSavingsBalance() + saver1.calculateMonthlyInterest());
        saver2.setSavingsBalance(saver2.getSavingsBalance() + saver2.calculateMonthlyInterest());
        saver3.setSavingsBalance(saver3.getSavingsBalance() - saver3.calculateMonthlyInterest());

        System.out.println(saver1.toString());
        System.out.println(saver2.toString());
        System.out.println(saver3.toString());
    }
}
