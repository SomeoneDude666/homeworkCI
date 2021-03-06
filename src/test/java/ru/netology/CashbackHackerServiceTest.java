package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackerServiceTest {

    @Test
    void shoulReturn100IfAmountIs900() {
        CashbackHackerService cashbackHacker = new CashbackHackerService();
        int amount = 900;
        int actual = cashbackHacker.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackerService cashbackHacker = new CashbackHackerService();
        int amount = 1000;
        int actual = cashbackHacker.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

}