package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = 3;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1to2_1() {
        int[] input = {1, 2, 3, 4};
        int source = 1;
        int destination = 2;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 3, 2, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2to1() {
        int[] input = {1, 2, 3, 4};
        int source = 2;
        int destination = 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 3, 2, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap3to0() {
        int[] input = {1, 2, 3, 4};
        int source = 3;
        int destination = 0;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }


    @Test
    void whenSwap1to2() {
        int[] input = {5, 9, 7};
        int source = 1;
        int destination = 2;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {5, 7, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap0to2() {
        int[] input = {5, 9, 7};
        int source = 0;
        int destination = 2;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {7, 9, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2to4() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 2;
        int destination = 4;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 5, 4, 3};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1to3() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 1;
        int destination = 3;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 4, 3, 2, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap4to6() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 4;
        int destination = 6;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 3, 4, 7, 6, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1to4() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 1;
        int destination = 4;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 5, 3, 4, 2, 6, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2to5() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 2;
        int destination = 5;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 6, 4, 5, 3, 7};
        assertThat(result).containsExactly(expected);
    }
}
