package com.wanted.models.user;

import java.util.ArrayList;

import com.wanted.models.recruitment.RecruitmentTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserTO {
	
	private String id; // 사용자 ID
	private String name; // 사용자 이름
	private String email; // 사용자 이메일
	private ArrayList<RecruitmentTO> recruitmentsApplied; // 지원한 채용공고 목록
	
}
