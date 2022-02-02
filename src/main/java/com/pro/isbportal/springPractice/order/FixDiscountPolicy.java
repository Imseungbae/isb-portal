package com.pro.isbportal.springPractice.order;

import com.pro.isbportal.springPractice.Grade;
import com.pro.isbportal.springPractice.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int fixDiscountPrice = 1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.BASIC){
            return 0;
        }
        else {
            return fixDiscountPrice;
        }
    }
}
