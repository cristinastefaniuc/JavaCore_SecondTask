package com.endava.javacore.task2.task9;

public class SavingsAccount {
    private static int annualInterestRate;
    private double savingsBalance;

    public SavingsAccount() {
    }

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public double calculateMonthlyInterest() {

        return (savingsBalance * annualInterestRate) / 12;
    }

    public static void modifyInterestRate(int interestRate) {
        annualInterestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "savingsBalance=" + savingsBalance +
                '}';
    }
}
