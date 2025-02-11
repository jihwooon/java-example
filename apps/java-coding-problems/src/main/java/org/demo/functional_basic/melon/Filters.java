package org.demo.functional_basic.melon;

import java.util.ArrayList;
import java.util.List;

public class Filters {

    public List<Melon> filterByType(
            final List<Melon> melons,
            final String type) {
        ArrayList<Melon> result = new ArrayList<>();

        for (Melon melon : melons) {
            if (type.equalsIgnoreCase(melon.type())) {
                result.add(melon);
            }
        }

        return result;
    }

    public List<Melon> filterByWeight(
            final List<Melon> melons,
            final int weight) {
        ArrayList<Melon> result = new ArrayList<>();

        for (Melon melon : melons) {
            if (melon.weight() == weight) {
                result.add(melon);
            }
        }

        return result;
    }

    public List<Melon> filterByMelon(List<Melon> melons,
            FilterPredicate filter) {
        ArrayList<Melon> result = new ArrayList<>();

        for (Melon melon : melons) {
            if (filter.test(melon)) {
                result.add(melon);
            }
        }

        return result;
    }
}
