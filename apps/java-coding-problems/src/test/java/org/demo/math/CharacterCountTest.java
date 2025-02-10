package org.demo.math;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("문자 개수 세기")
class CharacterCountTest {

    String VALUE = "abcdesgs";

    @Nested
    @DisplayName("Character")
    class Describe_of {

        @Test
        @DisplayName("문자가 주어질 때 같은 문자를 찾으면 현재 개수를 반환한다.")
        void runDuplicateCharacters() {
            CharacterCount characterCount = new CharacterCount();

            Map<Character, Integer> result = characterCount.countDuplicateCharacters(
                    VALUE);

            assertThat(result)
                    .containsEntry('a', 1)
                    .containsEntry('b', 1)
                    .containsEntry('c', 1)
                    .containsEntry('d', 1)
                    .containsEntry('e', 1)
                    .containsEntry('g', 1);
        }

        @Test
        @DisplayName("빈 문자가 주어지면 빈 문자열을 반환한다.")
        void runEmpty() {
            CharacterCount characterCount = new CharacterCount();

            Map<Character, Integer> result = characterCount.countDuplicateCharacters(
                    "");

            assertThat(result).isEmpty();
        }
    }

    @Nested
    @DisplayName("CharacterMap")
    class Describe_map {

        @Test
        @DisplayName("문자가 주어질 때 같은 문자를 찾으면 현재 개수를 반환한다.")
        void run() {
            CharacterCount characterCount = new CharacterCount();

            Map<Character, Long> result = characterCount.countDuplicateCharactersMap(
                    VALUE);

            assertThat(result)
                    .containsEntry('a', 1L)
                    .containsEntry('b', 1L)
                    .containsEntry('c', 1L)
                    .containsEntry('d', 1L)
                    .containsEntry('e', 1L)
                    .containsEntry('g', 1L);
        }
    }
}
