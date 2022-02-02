package com.pro.isbportal.springPractice;

public interface MemberService {

    void join(Member member);

    Member findMember(long id);
}
