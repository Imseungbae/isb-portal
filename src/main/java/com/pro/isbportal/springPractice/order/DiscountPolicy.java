package com.pro.isbportal.springPractice.order;

import com.pro.isbportal.springPractice.Grade;
import com.pro.isbportal.springPractice.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
