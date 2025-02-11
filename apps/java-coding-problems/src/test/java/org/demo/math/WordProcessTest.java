package org.demo.math;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("글자와 단어 뒤집기")
class WordProcessTest {

    @Test
    @DisplayName("문자열이 주어지면 문자열을 뒤집는다.")
    void testReverseWord() {
        WordProcess words = new WordProcess();

        String result = words.reverseWords("abc");

        assertThat(result).isEqualTo("cba");
    }
}
