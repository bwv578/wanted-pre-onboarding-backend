package com.wanted.models.company;

import java.util.ArrayList;

import com.wanted.models.recruitment.RecruitmentTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyTO {

	private String id; // 회사 ID
	private String name; // 회사이름
	private ArrayList<RecruitmentTO> announcementsPosted; // 회사가 올린 채용공고 목록

}
