package com.github.pattern.factory.abs;

import com.github.pattern.factory.Origin;
import com.github.pattern.factory.Phone;

/**
 * IFactory
 *
 * @author echils
 * @since 2021-06-16 15:25:13
 */
public interface IFactory {

    Phone apply();

    Origin from();

}
