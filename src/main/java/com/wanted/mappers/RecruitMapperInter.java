package com.wanted.mappers;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.wanted.models.recruitment.RecruitmentTO;

public interface RecruitMapperInter {
	
	// 모든 채용공고 조회
	@Select("select "
			+ "rec.id as id, rec.companyID as companyID, "
			+ "com.name as companyName, com.nation as nation, com.region as region, "
			+ "rec.position as position, rec.compensation as compensation, "
			+ "rec.tech as tech, rec.content as content "
			+ "from recruitment rec inner join company com "
			+ "on rec.companyID = com.id")
	public ArrayList<RecruitmentTO> selectAllRecruitments();
	
	// 채용공고 등록
	@Insert("insert into recruitment values(0, #{companyID}, #{position}, #{compensation}, #{tech}, #{content})")
	public int postRecruitment(RecruitmentTO newRec);
	
}
