package kr.or.ye.domain;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberVO {
	
	private String userid      ;
	private String userpw      ;
	private boolean enabled     ;
	private String username    ;
	private Date regdate     ;
	private String usermail   ;
	private String userphone    ;
	
	private List<AuthVO> authList;
	
	
}
