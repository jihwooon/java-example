package org.demo.functional_basic.filter;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class FilterTest {

    private Filter filters;
    private ArrayList<Melon> melons = new ArrayList<>();
    private List<Integer> numbers = Arrays.asList(1, 2, 3);

    @BeforeEach
    void setUp() {
        filters = new Filter();
        melons.addAll(
                List.of(
                        new Melon("gac", 10),
                        new Melon("type", 30),
                        new Melon("apple", 5000)
                ));
    }

    @Nested
    @DisplayName("객체가 주어질 때")
    class Describe_Filter {

        @Test
        @DisplayName("type이 일치하면 해당 Melon 목록을 반환한다.")
        void it_return_filtered_type_by_Melon() {
            List<Melon> sut = filters.filter(
                    melons, melon -> "gac".equalsIgnoreCase(melon.type()));

            assertThat(sut).isEqualTo(
                    List.of(new Melon("gac", 10)));
        }

        @Test
        @DisplayName("number가 10 미만이면 numbers 목록을 반환한다.")
        void name() {
            List<Integer> sut = filters.filter(numbers, i -> i < 10);

            assertThat(sut).isEqualTo(List.of(1, 2, 3));
        }
    }
}
