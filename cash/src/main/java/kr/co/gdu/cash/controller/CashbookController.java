package kr.co.gdu.cash.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.gdu.cash.service.CashbookService;
import kr.co.gdu.cash.service.IndexService;
import kr.co.gdu.cash.vo.Notice;

@Controller
public class CashbookController {
	
	@Autowired private CashbookService cashbookService;
	
	@GetMapping(value="/cashbookByMonth")
	public String cashbookByMonth(Model model,
			@RequestParam(name = "currentYear", defaultValue = "-1") int currentYear,
			@RequestParam(name = "currentMonth", defaultValue = "-1") int currentMonth) { 
		// 1-1. 요청분석
		Calendar currentDay = Calendar.getInstance(); // 2020년 11월 2일
		// currentYear 넘어오고, currentMonth도 넘어면
		if(currentYear != -1 && currentMonth != -1) {
			if(currentMonth == 0) {
				currentYear -= 1;
				currentMonth = 12;
			}
			if(currentMonth == 13) {
				currentYear += 1;
				currentMonth = 1;
			}
			currentDay.set(Calendar.YEAR, currentYear);
			currentDay.set(Calendar.MONTH, currentMonth-1);
		}
		currentDay.set(Calendar.DATE, 1); // 2020년 11월 1일
		
		currentYear = currentDay.get(Calendar.YEAR);
		currentMonth = currentDay.get(Calendar.MONTH) + 1;
		int lastDay = currentDay.getActualMaximum(Calendar.DATE);
		int firstDayOfWeek = currentDay.get(Calendar.DAY_OF_WEEK);
		// -----------------------------------------------------------------------------
		int sumIn = cashbookService.getSumCashbookPriceByInOut("지출", currentYear, currentMonth);
		int sumOut = cashbookService.getSumCashbookPriceByInOut("수입", currentYear, currentMonth);
		
		// -----------------------------------------------------------------------------
		
		// 3. 뷰 모델 추가
		model.addAttribute("currentYear", currentYear); // 년
		model.addAttribute("currentMonth", currentMonth); // 월
		model.addAttribute("lastDay", lastDay); // 마지막 일
		model.addAttribute("firstDayOfWeek", firstDayOfWeek); // 1일의 요일
		
		model.addAttribute("sumIn", sumIn);
		model.addAttribute("sumOut", sumOut);
		
		return "cashbookByMonth";
	}
}