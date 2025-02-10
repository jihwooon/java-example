package org.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void run() {
        assertThat(new Main().getGreeting()).isEqualTo("Hello, World!");
    }
}
