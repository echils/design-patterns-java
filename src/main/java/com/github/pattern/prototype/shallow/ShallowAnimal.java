package com.github.pattern.prototype.shallow;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 浅克隆
 *
 * @author echils
 * @since 2020-01-05 22:24:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShallowAnimal implements Cloneable {

    private String name;

    private String age;

    private ShallowAnimal friend;

    @Override
    public ShallowAnimal clone() {
        try {
            return (ShallowAnimal) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
