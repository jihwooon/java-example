package org.demo.array;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    void name() {
        BubbleSort bubbleSort = new BubbleSort();

        int[] ints = bubbleSort.bubbleSort(new int[]{1, 5, 2, 4, 3});

        assertThat(ints).isEqualTo(new int[]{1, 2, 3, 4, 5});
    }
}
