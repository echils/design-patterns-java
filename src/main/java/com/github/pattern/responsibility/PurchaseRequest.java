package com.github.pattern.responsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 购买审批单
 *
 * @author echils
 * @since 2020-01-18 15:15:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseRequest {

    private int price;

}
