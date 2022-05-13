package kr.or.ye.security;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.ibatis.javassist.SerialVersionUID;
import org.apache.tomcat.jni.Mmap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import kr.or.ye.domain.MemberVO;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Slf4j
public class CustomUser extends User{
	private static final long SerialVersionUID = 1L;
	
	@Autowired
	private MemberVO memberVO;
	
	public CustomUser(String username,String password,Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}
	
	
	public CustomUser(MemberVO memberVO) {
		super(memberVO.getUserid(), memberVO.getUserpw(),
				memberVO.getAuthList().stream()
				.map(auth -> new SimpleGrantedAuthority(auth.getAuth())).collect(Collectors.toList()));
		
		List<SimpleGrantedAuthority> streamList = memberVO.getAuthList().stream().map(auth33 -> new SimpleGrantedAuthority(auth33.getAuth())).collect(Collectors.toList());
		log.info("stream result:"+streamList);
		
		this.memberVO = memberVO; //****중요*****
	
	}
	
	
	
}
