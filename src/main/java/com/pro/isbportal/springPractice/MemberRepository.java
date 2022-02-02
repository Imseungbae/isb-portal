package com.pro.isbportal.springPractice;

public interface MemberRepository {

    Long save(Member member);

    Member findById(Long id);
}
