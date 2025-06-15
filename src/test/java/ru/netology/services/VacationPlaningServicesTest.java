package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationPlaningServicesTest {
    @Test
    void monthCounterCase1() {
        VacationPlaningService service = new VacationPlaningService();

        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;

        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void monthCounterCase2() {
        VacationPlaningService service = new VacationPlaningService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int expected = 2;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}