package org.demo.array;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SortTest {

    @Test
    void sortNumber() {
        assertThat(Sort.sortNumer(new int[]{5, 4, 3, 1, 2, 5, 6})).isEqualTo(
                new int[]{1, 2, 3, 4, 5, 5, 6});
    }
}
