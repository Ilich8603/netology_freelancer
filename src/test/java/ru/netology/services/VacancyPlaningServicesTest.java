package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacancyPlaningServicesTest {
    @Test
    void shouldCase1() {
        VacancyPlaningService service = new VacancyPlaningService();

        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;

        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCase2() {
        VacancyPlaningService service = new VacancyPlaningService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}