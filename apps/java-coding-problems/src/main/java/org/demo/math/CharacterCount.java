package org.demo.math;

import java.util.HashMap;
import java.util.Map;

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
}
