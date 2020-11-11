package kr.co.gdu.cash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.gdu.cash.service.MemberService;
import kr.co.gdu.cash.vo.Member;

@Controller
public class MemberController {
	@Autowired private MemberService memberService;
	
	// 1.
	@GetMapping("/admin/addMember") 
	public String addMember() {
		return "addMember";
	}
	
	// 4. 
	@PostMapping("/admin/addMember")
	public String addMember(Member member) {
		memberService.addMember(member); // 5.
		return "redirect:/admin/index"; // "redirect:/admin/memberList" 추가
	}
}
