package com.wanted.models.recruitment;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wanted.mappers.RecruitMapperInter;

@Repository
public class RecruitmentDAO {
	
	@Autowired
	private RecruitMapperInter recruitMapper;
	
	// 모든 채용공고 조회
	public ArrayList<RecruitmentTO> selectAllRecruitments(){
		ArrayList<RecruitmentTO> allRecruitments = recruitMapper.selectAllRecruitments();
		return allRecruitments;
	}
	
	// 채용공고 올리기
	public int postRecruitment(RecruitmentTO newRec) {
		int result = recruitMapper.postRecruitment(newRec);
		return result;
	}
}
