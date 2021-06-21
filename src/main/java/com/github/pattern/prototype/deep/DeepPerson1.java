package com.github.pattern.prototype.deep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 深克隆1
 *
 * @author echils
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeepPerson1 implements Cloneable {

    private String name;

    private int age;

    private Friend1 friend;

    @Override
    public DeepPerson1 clone() {
        DeepPerson1 deepPerson1 = null;
        try {
            deepPerson1 = (DeepPerson1) super.clone();
            deepPerson1.setFriend(deepPerson1.getFriend().clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deepPerson1;
    }

}
