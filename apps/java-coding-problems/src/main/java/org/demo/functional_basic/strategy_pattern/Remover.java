package org.demo.functional_basic.strategy_pattern;

public class Remover {

    public String remove(String s, RemoveStrategy strategy) {
        return strategy.execute(s);
    }

}
