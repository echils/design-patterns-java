package com.github.pattern.prototype.deep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * 深克隆2
 *
 * @author echils
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeepPerson2 implements Serializable {

    private String name;

    private int age;

    private Friend2 friend;

    public DeepPerson2 clone() {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(bos)) {
                oos.writeObject(this);
                try (ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray())) {
                    try (ObjectInputStream ois = new ObjectInputStream(bis)) {
                        return (DeepPerson2) ois.readObject();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
