package ru.job4j.condition;

import static org.assertj.core.api.Assertions.withPrecision;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class SqAreaTest {

    @Test
    void whenP6K2Square2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP14K6Square6() {
        double p = 14;
        double k = 6;
        double expected = 6;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP29Dot5K7Dot6Square22Dot35() {
        double p = 29.5;
        double k = 7.6;
        double expected = 22.35;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}