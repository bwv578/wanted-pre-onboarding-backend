package com.wanted.models.recruitment;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecruitmentTO {
	
	private String id; // 채용공고 ID
	private String companyID; // 회사ID
	private String companyName; // 회사명
	private String nation; // 국가
	private String region; // 지역
	private String position; // 채용 포지션
	private String compensation; // 채용 보상금
	private String tech; // 사용기술
	private String content; // 채용내용
	private ArrayList<String> otherRecs; // 회사가 올린 다른 채용 공고
	
}
