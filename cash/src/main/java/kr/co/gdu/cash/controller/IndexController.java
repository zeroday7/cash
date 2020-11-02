package kr.co.gdu.cash.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.gdu.cash.service.IndexService;
import kr.co.gdu.cash.vo.Notice;

@Controller
public class IndexController {
	@Autowired
	private IndexService indexService;
	
	@GetMapping(value={"/","/index"})
	public String index(Model model) {
		// 1. 요청분석
		Calendar c = Calendar.getInstance(); // 2020년 11월 2일
		int month = c.get(Calendar.MONTH) + 1;// 월
		int lastDay = c.getActualMaximum(Calendar.DATE);
		System.out.println(month+"<-month");
		System.out.println(lastDay+"<-lastDay");
		
		Calendar firstDay = Calendar.getInstance();
		firstDay.set(Calendar.DATE, 1); // 2020년 11월 1일
		int firstDayOfWeek = firstDay.get(Calendar.DAY_OF_WEEK);
		System.out.println(firstDayOfWeek+"<-firstDayOfWeek");
		
		// 2. 서비스 호출
		List<Notice> list = indexService.getLatestNoticeList();
		
		// 3. 뷰 모델 추가
		/*
		 * 1) 월, 마지막 일(31일, 30일,...), 1일 요일
		 */
		model.addAttribute("month", month); // 월
		model.addAttribute("lastDay", lastDay); // 마지막 일
		model.addAttribute("firstDayOfWeek", firstDayOfWeek); // 1일의 요일
		model.addAttribute("list", list);
		return "index";
	}
}