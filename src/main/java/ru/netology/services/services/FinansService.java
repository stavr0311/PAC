package ru.netology.services.services;

public class FinansService {

    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int months = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                months++;
            } else {
                money += income;
                money -= expenses;
            }
        }
        return months;
    }
}