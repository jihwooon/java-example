package org.demo.math;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 문자 개수 세기
 */
public class CharacterCount {

    public Map<Character, Integer> countDuplicateCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();

        for (char ch : str.toCharArray()) {
            result.compute(ch, (k, v) -> (v == null) ? 1 : null);
        }

        return result;
    }

    public Map<Character, Long> countDuplicateCharactersMap(String str) {
        Map<Character, Long> collect = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return collect;
    }
}
