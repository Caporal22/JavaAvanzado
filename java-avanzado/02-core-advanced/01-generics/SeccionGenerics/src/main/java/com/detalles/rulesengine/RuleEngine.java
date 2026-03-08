package com.detalles.rulesengine;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine<T> {

    private final List<Rule<T>> rules = new ArrayList<>();

    public RuleEngine<T> addRule(Rule<T> rule) {
        rules.add(rule);
        return this;
    }

    public boolean evaluate(T context) {
        for (Rule<T> rule : rules) {
            if (!rule.evaluate(context)) {
                return false;
            }
        }
        return true;
    }
}
