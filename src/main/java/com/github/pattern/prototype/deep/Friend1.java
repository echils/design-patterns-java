package com.github.pattern.prototype.deep;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 深克隆1
 *
 * @author echils
 * @since 2020-01-05 22:24:23
 */
@Data
@AllArgsConstructor
public class Friend1 implements Cloneable {

    private String name;

    @Override
    public Friend1 clone() throws CloneNotSupportedException {
        return (Friend1) super.clone();
    }

}
