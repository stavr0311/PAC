package ru.netology.services.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.*;

class FinansServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Finans.csv")
    public void testNumberOfMonthsOfRest(int income, int expenses, int threshold, int expected) {
        FinansService service = new FinansService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}