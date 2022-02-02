package com.pro.isbportal.springPractice;

import java.util.HashMap;

public class MemoryMemberRepository implements MemberRepository {

    private static long id = 0;
    private static HashMap<Long, Member> memberStore = new HashMap<>();

    @Override
    public Long save(Member member) {
        member.setId(++id);
        memberStore.put(id, member);
        return id;
    }

    @Override
    public Member findById(Long id) {
        return memberStore.get(id);
    }
}
