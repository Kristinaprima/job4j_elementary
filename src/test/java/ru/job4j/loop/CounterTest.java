package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromtwoToTenThenThirty() {
        int start = -20;
        int finish = 0;
        int result = Counter.sumByEven(start, finish);
        int expected = -110;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromTrirtyToNinetyNineThenMoreTwoThousand() {
        int start = 30;
        int finish = 99;
        int result = Counter.sumByEven(start, finish);
        int expected = 2240;
        assertThat(result).isEqualTo(expected);
    }
}