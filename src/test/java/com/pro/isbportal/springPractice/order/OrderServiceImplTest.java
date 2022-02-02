package com.pro.isbportal.springPractice.order;

import com.pro.isbportal.springPractice.Grade;
import com.pro.isbportal.springPractice.Member;
import com.pro.isbportal.springPractice.MemberService;
import com.pro.isbportal.springPractice.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    private final MemberService memberService = new MemberServiceImpl();
    private final OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        // given
        Member member = new Member(1L, "isb", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(member.getId(), "item-1", 10000);
        //when
        //then
        Assertions.assertThat(order.calculatePrice()).isEqualTo(9000);
    }

    @Test
    void rateDiscount() {
        //given
        Member member = new Member(2L, "jdk", Grade.VIP);
        memberService.join(member);

        DiscountPolicy discountPolicy = new RateDiscountPolicy();
        int discountPrice = discountPolicy.discount(member, 5000);
        Assertions.assertThat(discountPrice).isEqualTo(4500);
    }
}