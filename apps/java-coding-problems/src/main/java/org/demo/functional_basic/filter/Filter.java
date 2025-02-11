package org.demo.functional_basic.filter;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    <T> List<T> filter(List<T> list, FilterPredicate<T> predicate) {
        ArrayList<T> result = new ArrayList<>();

        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
