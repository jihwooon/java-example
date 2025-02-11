package org.demo.functional_basic.melon;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Filters Class")
class FiltersTest {

    private Filters filters;
    private ArrayList<Melon> melons = new ArrayList<>();

    @BeforeEach
    void setUp() {
        filters = new Filters();
        melons.addAll(
                List.of(
                        new Melon("gac", 10, ""),
                        new Melon("type", 30, ""),
                        new Melon("apple", 5000, "")
                ));
    }

    @Nested
    @DisplayName("Melon 목록이 주어질 때")
    class Describe_Filter {

        @Test
        @DisplayName("type이 일치하면 해당 Melon 목록을 반환한다.")
        void it_return_filtered_type_by_Melon() {
            List<Melon> sut = filters.filterByType(melons, "gac");

            assertThat(sut).isEqualTo(List.of(new Melon("gac", 10, "")));
        }

        @Test
        @DisplayName("type이 일치하지 않으면 빈 배열을 반환한다.")
        void it_return_empty_ignore_type_by_Melon() {
            List<Melon> sut = filters.filterByType(melons, "cc");

            assertThat(sut).isEqualTo(List.of());
        }


        @Test
        @DisplayName("weight가 일치하면 해당 Melon 목록을 반환한다.")
        void it_return_filtered_weight_by_Melon() {
            List<Melon> sut = filters.filterByWeight(melons, 10);

            assertThat(sut).isEqualTo(List.of(new Melon("gac", 10, "")));
        }

        @Test
        @DisplayName("weight가 일치하지 않으면 빈 배열을 반환한다.")
        void it_return_empty_ignore_weight_by_Melon() {
            List<Melon> sut = filters.filterByWeight(melons, 999);

            assertThat(sut).isEqualTo(List.of());
        }

        @Test
        @DisplayName("type gac 일치하는 Melon 목록을 반환한다")
        void it_return_filter_type_by_Melon() {
            List<Melon> sut = filters.filterByMelon(melons,
                    m -> "gac".equalsIgnoreCase(m.type()));

            assertThat(sut).isEqualTo(List.of(new Melon("gac", 10, "")));
        }

        @Test
        @DisplayName("weight가 5000 일치하면 해당 Melon 목록을 반환한다")
        void it_return_filter_weight_by_Melon() {
            List<Melon> sut = filters.filterByMelon(melons, m -> m.weight() == 5000);

            assertThat(sut).isEqualTo(List.of(new Melon("apple", 5000, "")));
        }
    }
}
