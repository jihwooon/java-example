package org.demo.array;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.Test;

class ObjectSortTest {

    @Test
    void sortObjects() {
        Melon[] melons = new Melon[]{
                new Melon("Cantaloupe", 2000),
                new Melon("Galia", 1500),
                new Melon("Watermelon", 5000),
                new Melon("Honeydew", 3000)
        };

        Arrays.sort(melons,
                Comparator.comparingInt(Melon::weight));

        assertThat(Arrays.asList(melons)).isEqualTo(Arrays.asList(
                new Melon("Galia", 1500),
                new Melon("Cantaloupe", 2000),
                new Melon("Honeydew", 3000),
                new Melon("Watermelon", 5000)
        ));
    }

    @Test
    void sortObject_sameWeight() {
        Melon[] melons = new Melon[]{
                new Melon("Cantaloupe", 2000),
                new Melon("Galia", 1500),
                new Melon("Watermelon", 5000),
                new Melon("Honeydew", 3000)
        };

        Arrays.sort(melons,
                (o1, o2) -> Integer.compare(o1.weight(), o2.weight()));

        assertThat(Arrays.asList(melons)).isEqualTo(Arrays.asList(
                new Melon("Galia", 1500),
                new Melon("Cantaloupe", 2000),
                new Melon("Honeydew", 3000),
                new Melon("Watermelon", 5000)
        ));
    }
}
