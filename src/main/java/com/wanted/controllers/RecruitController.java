package com.wanted.controllers;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wanted.models.recruitment.RecruitmentDAO;
import com.wanted.models.recruitment.RecruitmentTO;
import com.wanted.models.user.UserDAO;
import com.wanted.models.user.UserTO;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/recruitments")
public class RecruitController {

	@Autowired
	private RecruitmentDAO recruitmentDAO;
	
	@GetMapping // 모든 채용공고 조회
	public ArrayList<HashMap<String, String>> getAllRecruitments(HttpServletRequest req) {
		
		ArrayList<HashMap<String, String>> result = new ArrayList<>();
		ArrayList<RecruitmentTO> recruitments = recruitmentDAO.selectAllRecruitments();
		
		for(RecruitmentTO recruitment : recruitments) {
			HashMap<String, String> recJSON = new HashMap<>();
			
			recJSON.put("채용공고ID", recruitment.getId());
			recJSON.put("회사명", recruitment.getCompanyName());
			recJSON.put("국가", recruitment.getNation());
			recJSON.put("지역", recruitment.getRegion());
			recJSON.put("채용포지션", recruitment.getPosition());
			recJSON.put("채용보상금", recruitment.getCompensation());
			recJSON.put("사용기술", recruitment.getTech());
			
			result.add(recJSON);
		}
		
		return result;
	}
	
	@GetMapping("/{id}")
	public HashMap<String, String> getRecruitmentById(@PathVariable String id){
		HashMap<String, String> result = new HashMap<>();
		return result;
	}
	
	@PostMapping // 채용공고 올리기
	public void postRecruitments(@RequestBody RecruitmentTO newRec) {
		System.out.println("요청옴");
		System.out.println(newRec.getContent());
		
		recruitmentDAO.postRecruitment(newRec);
	}
	
}
