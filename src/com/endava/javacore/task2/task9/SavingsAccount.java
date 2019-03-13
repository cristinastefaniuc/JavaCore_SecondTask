package com.endava.javacore.task2.task9;

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount() {
    }

    public SavingsAccount(double savingsBalance) {
        annualInterestRate = 0;
        this.savingsBalance = savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public double calculateMonthlyInterest() {
        if(savingsBalance <= 0) {
            annualInterestRate = annualInterestRate * 5;
            savingsBalance = Math.abs(savingsBalance);
        }
        return (savingsBalance * annualInterestRate) / 12;
    }

    public static void modifyInterestRate(double interestRate) {
        annualInterestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "savingsBalance=" + savingsBalance +
                '}';
    }
}
