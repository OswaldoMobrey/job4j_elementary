package ru.job4j.condition;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class MaxTest {
    @Test
    void whenMax33To25Then33() {
        int left = 33;
        int right = 25;
        int result = Max.max(left, right);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax48To50Then50() {
        int left = 48;
        int right = 50;
        int result = Max.max(left, right);
        int expected = 50;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax60To60Then60() {
        int left = 60;
        int right = 60;
        int result = Max.max(left, right);
        int expected = 60;
        assertThat(result).isEqualTo(expected);
    }

}