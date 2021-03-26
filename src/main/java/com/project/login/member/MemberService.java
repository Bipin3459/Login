package com.project.login.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	public final MemberRepository memberRepository;

	@Autowired
	public MemberService(MemberRepository memberRepository) {
		super();
		this.memberRepository = memberRepository;
	}
	
	public List<Member> getMembers(){
		return memberRepository.findAll();
	}
}
