package org.demo.functional_basic.melon;

@FunctionalInterface
public interface FilterPredicate {

    boolean test(Melon melon);
}
