package org.pyrih.demo.junit5;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {
    @Test
    @DisplayName("Should demonstrate a simple assertion")
    void shouldShowSimpleAssertion() {
        assertEquals(1, 1);
    }

    @Test
    void shouldCheckAllItemsInTheList() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

        assertAll(() -> assertEquals(2, numbers.get(0)),
                    () -> assertEquals(3, numbers.get(1)),
                    () -> assertEquals(5, numbers.get(2)),
                    () -> assertEquals(7, numbers.get(3)));
    }

    @Test
    void shouldOnlyRunTheTestIfSomeCriteriaAreMet() {
        Assumptions.assumeTrue(10 > 15);
        assertEquals(1, 1);
    }

    @ParameterizedTest // also we can add name where describes test output
    @DisplayName("Should create shapes with different numbers of sides")
    @ValueSource(ints = {3, 4, 5, 8, 14})
    void shouldCreateShapesWithDifferentNumbersOfSides(int expectedNumberOfSides) {
        Shape shape = new Shape(expectedNumberOfSides);
        assertEquals(expectedNumberOfSides, shape.numberOfSides());

    }

    @ParameterizedTest // also we can add name where describes test output
    @DisplayName("Should not create shapes with different numbers of sides")
    @ValueSource(ints = {0, 1, 2,Integer.MAX_VALUE})
    void shouldNotCreateShapesWithDifferentNumbersOfSides(int expectedNumberOfSides) {
        assertThrows(IllegalArgumentException.class, () -> new Shape(expectedNumberOfSides));

    }

    @Test
    @Disabled
    void shouldShowSimpleAssertionFailed() {

//        assertEquals(1, 2);
        fail("Not implemented yet");
    }

    @Test
    @Disabled("Not implemented yet")
    void shouldShowSimpleAssertionDisabled() {
        assertEquals(1, 1);
    }

    private class Shape {
        private final int sides;

        public Shape(int expectedNumberOfSides) {
            if (expectedNumberOfSides < 3 || expectedNumberOfSides == Integer.MAX_VALUE)
                throw new IllegalArgumentException();
            sides = expectedNumberOfSides;
        }

        public int numberOfSides() {
            return sides;
        }

        public String description() {
            if (sides == 4) {
                return "Square";
            }
            return "Invalid...";
        }
    }

    @Nested
    @DisplayName("When a shape has been created")
    class WhenShapeExists {
        private final Shape shape = new Shape(4);

        @Nested
        @DisplayName("Should allow")
        class ShouldAllow {
            @Test
            @DisplayName("Seeing the number of sides")
            void seeingTheNumberOfSides() {
                assertEquals(4, shape.numberOfSides());
            }

            @Test
            @DisplayName("Seeing the description")
            void seeingTheDescription() {
                assertEquals("Square", shape.description());
            }
        }

        @Nested
        @DisplayName("Should not")
        class ShouldANot {
            @Test
            @DisplayName("Seeing the number of sides")
            void beEqualToAnotherShapeWithTheSameNumberOfSides() {
                assertNotEquals(4, shape);
            }

        }
    }
}