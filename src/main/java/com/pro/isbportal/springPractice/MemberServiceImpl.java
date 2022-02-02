package com.pro.isbportal.springPractice;

public class MemberServiceImpl implements MemberService{

//    private final MemoryMemberRepository memberRepository = new MemoryMemberRepository();

    private MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(long id) {
        return memberRepository.findById(id);
    }
}
