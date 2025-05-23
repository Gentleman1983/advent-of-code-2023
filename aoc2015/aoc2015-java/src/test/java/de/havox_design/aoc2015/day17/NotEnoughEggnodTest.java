package de.havox_design.aoc2015.day17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class NotEnoughEggnodTest {

    @ParameterizedTest
    @MethodSource("getDataForPart1")
    void testPart1(String fileName, int expectedNumberOfCombinations) {
        Assertions.assertEquals(expectedNumberOfCombinations, NotEnoughEggnod.countCombinations(fileName, 25));
    }

    private static Stream<Arguments> getDataForPart1() {
        return Stream.of(
                Arguments.of("de/havox_design/aoc2015/day17/day17Sample.txt", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("getDataForPart2")
    void testPart2(String fileName, int expectedNumberOfCombinations) {
        Assertions.assertEquals(expectedNumberOfCombinations, NotEnoughEggnod.countLimitedCombinations(fileName, 25));
    }

    private static Stream<Arguments> getDataForPart2() {
        return Stream.of(
                Arguments.of("de/havox_design/aoc2015/day17/day17Sample.txt", 3)
        );
    }
}
