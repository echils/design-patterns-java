package com.github.pattern.prototype.deep;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 深克隆1
 *
 * @author echils
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
