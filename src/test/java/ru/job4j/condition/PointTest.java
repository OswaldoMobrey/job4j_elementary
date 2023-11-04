package ru.job4j.condition;

import static org.assertj.core.api.Assertions.withPrecision;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void when96To74Then2Dot82() {
        double expected = 2.82;
        int x1 = 9;
        int y1 = 6;
        int x2 = 7;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when114To126Then2Dot23() {
        double expected = 2.23;
        int x1 = 11;
        int y1 = 4;
        int x2 = 12;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12648To259360Then339Dot16() {
        double expected = 339.16;
        int x1 = 126;
        int y1 = 48;
        int x2 = 259;
        int y2 = 360;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}