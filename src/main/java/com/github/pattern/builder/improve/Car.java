package com.github.pattern.builder.improve;

import lombok.Data;

/**
 * 车实体类
 *
 * @author echils
 */
@Data
public class Car {

    /**
     * 车身
     */
    private String body;

    /**
     * 轮胎
     */
    private String tire;

    /**
     * 引擎
     */
    private String engine;

}
