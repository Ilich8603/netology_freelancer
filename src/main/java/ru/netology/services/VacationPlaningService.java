package ru.netology.services;

public class VacationPlaningService {
    public int calculate(int income, int expenses, int threshold) {
        int monthCounter = 0; // счётчик месяцев отдыха
        int deposit = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (deposit >= threshold) { // можем ли отдыхать?
                monthCounter++; // увеличиваем счётчик месяцев отдыха
                deposit = (deposit - expenses) / 3;
            } else {
                deposit = deposit + income - expenses;
            }
        }
        return monthCounter;
    }
}
