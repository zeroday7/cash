package kr.co.gdu.cash.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.gdu.cash.service.IndexService;

@Controller
public class IndexController {
	
	@Autowired private IndexService indexService;
	
	@GetMapping(value={"/","/index"})
	public String index(Model model) { 
		Map<String, Object> map = indexService.getNoticeAndInOutList();
		model.addAttribute("noticeList", map.get("noticeList"));
		model.addAttribute("inOutList", map.get("inOutList"));
		return "index";
	}
}
