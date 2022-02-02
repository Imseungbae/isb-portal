package com.pro.isbportal.springPractice.order;

import com.pro.isbportal.springPractice.Grade;
import com.pro.isbportal.springPractice.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    @Override
    public int discount(Member member, int price) {

        if(member.getGrade() == Grade.VIP){
            int result = (price - price/10);
            System.out.println("result: " + result);
            return result;
        }
        return 0;
    }
}
