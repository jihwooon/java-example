package org.demo.functional_basic.strategy_pattern;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Remover Class")
class RemoverTest {

    @Test
    @DisplayName("문자가 주어질때 문자에 공백을 제거하고 나머지 문자를 리턴한다")
    void it_return_remove_whitespace() {
        Remover remover = new Remover();

        String result = remover.remove("abc  123  45",
                new WhitespacesRemover());

        assertThat(result).isEqualTo("abc12345");
    }

    @Test
    @DisplayName("람다식이 주어지고 문자가 주어질때 문자에 숫자를 제거하고 나머지 문자를 리턴한다")
    void it_return_remove_number_lamda() {
        Remover remover = new Remover();

        String result = remover.remove("abc12345",
                s -> s.replaceAll("\\d", ""));

        assertThat(result).isEqualTo("abc");
    }

    @Test
    @DisplayName("람다식이 주어지고 문자가 주어질때 문자에 공백을 제거하고 나머지 문자를 리턴한다")
    void it_return_remove_whitespace_lamda() {
        Remover remover = new Remover();

        String result = remover.remove("abc  123  45",
                s -> s.replaceAll("\\s", ""));

        assertThat(result).isEqualTo("abc12345");
    }
}
