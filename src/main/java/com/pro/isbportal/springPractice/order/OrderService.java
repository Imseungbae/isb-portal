package com.pro.isbportal.springPractice.order;

import com.pro.isbportal.springPractice.Member;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
