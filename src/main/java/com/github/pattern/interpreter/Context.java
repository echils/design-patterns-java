package com.github.pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文
 *
 * @author echils
 * @since 2020-01-14 22:28:32
 */
public class Context {

    private Map<Variable, Boolean> map = new HashMap<>();

    public void set(Variable var, boolean value) {
        map.put(var, value);
    }

    public boolean get(Variable var) throws IllegalArgumentException {
        Boolean value = map.get(var);
        if (value == null) {
            throw new IllegalArgumentException();
        }
        return value;
    }
}