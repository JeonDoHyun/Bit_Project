package kr.co.mlec.email.service;

import kr.co.mlec.member.vo.MemberVO;

public interface EmailService {
	public MemberVO searchId(MemberVO vo);
	public MemberVO searchPwd(MemberVO vo);

}
