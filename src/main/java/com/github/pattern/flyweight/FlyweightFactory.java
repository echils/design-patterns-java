package com.github.pattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元工厂类
 *
 * @author echils
 * @since 2021-06-17 16:26:58
 */
public class FlyweightFactory {

    /**
     * 缓存用户分享
     */
    private Map<String, IFlyWeight> flyWeightMap = new ConcurrentHashMap<>();


    /**
     * 提供
     *
     * @param name 内部状态
     * @return
     */
    public IFlyWeight apply(String name) {
        return flyWeightMap.computeIfAbsent(name, ConcreteFlyWeight::new);
    }

}
