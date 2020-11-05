package kr.co.gdu.cash.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.gdu.cash.service.NoticeService;

@Controller
public class IndexController {
	
	@Autowired private NoticeService noticeService;
	
	@GetMapping(value="/admin/index")
	public String index(Model model) { 
		Map<String, Object> map = noticeService.getNoticeAndInOutList();
		model.addAttribute("noticeList", map.get("noticeList"));
		model.addAttribute("inOutList", map.get("inOutList"));
		return "index";
	}
}
