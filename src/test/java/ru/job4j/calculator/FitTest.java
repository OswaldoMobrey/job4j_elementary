package ru.job4j.calculator;

import static org.assertj.core.api.Assertions.withPrecision;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class FitTest {

    @Test
    void whenMan187Then100Dot05() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman168Then78Dot19() {
        short in = 168;
        double expected = 78.19;
        double out = Fit.manWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}