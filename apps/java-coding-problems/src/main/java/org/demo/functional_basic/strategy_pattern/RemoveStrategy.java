package org.demo.functional_basic.strategy_pattern;

@FunctionalInterface
public interface RemoveStrategy {

    String execute(String s);
}
