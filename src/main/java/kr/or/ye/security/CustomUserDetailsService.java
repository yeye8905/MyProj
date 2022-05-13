package kr.or.ye.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import kr.or.ye.domain.MemberVO;
import kr.or.ye.mapper.MemberMapper;

public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		MemberVO memberVO = memberMapper.read(username);
		return memberVO == null?null:new CustomUser(memberVO);
	
	}
}
