package com.github.pattern.memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 存档管理器
 *
 * @author echils
 */
public class Caretaker {

    private Map<String, List<Memento>> map = new HashMap<>();

    /**
     * 添加存档
     */
    public void addMemento(String id, Memento memento) {
        List<Memento> mementos = map.computeIfAbsent(id, i -> new ArrayList<>());
        mementos.add(memento);
    }

    /**
     * 获取存档
     */
    public Memento getMemento(String id, int no) {
        if (map.containsKey(id)) {
            return map.get(id).get(no);
        }
        return null;
    }

    /**
     * 删除存档
     */
    public void delMemento(String id, Memento memento) {
        if (map.containsKey(id)) {
            List<Memento> mementos = map.get(id);
            if (mementos.size() != 0) {
                mementos.remove(memento);
            }
        }
    }
}
