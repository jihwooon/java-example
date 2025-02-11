package org.demo.math;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 글자와 단어 뒤집기
 */
public class WordProcess {

    private static final String WHITESPACE = " ";

    public String reverseWords(final String str) {
        return Arrays.stream(str.split(WHITESPACE))
                .map(Word::new)
                .map(Word::reverse)
                .collect(Collectors.joining(WHITESPACE));
    }

    private record Word(String word) {

        public String reverse() {
                return new StringBuilder(word).reverse().toString();
            }
        }
}
