package kr.or.ye.mapper;

import kr.or.ye.domain.MemberVO;

public interface MemberMapper { //dao랑 같은 역할을 함
	public MemberVO read(String useid);

}
