package kr.co.gdu.cash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.gdu.cash.service.NoticeService;
import kr.co.gdu.cash.vo.Notice;

@Controller
public class NoticeController {
	@Autowired private NoticeService noticeService;
	// 공지 목록
	@GetMapping("/admin/noticeList")
	public String noticeList(Model model,
							@RequestParam(value = "currentPage", defaultValue = "1") int currentPage) {
		// noticeService 호출
		return "noticeList";
	}
	// 공지 입력 폼
	@GetMapping("/admin/addNotice")
	public String addNotice() {
		return "addNotice";
	}
	// 공지 입력 액션
	@PostMapping("/admin/addNotice")
	public String addNotice(Notice notice) {
		return "redirect:/admin/noticeList";
	}
	// 공지 상세 보기
	@GetMapping("/admin/noticeOne")
	public String noticeOne(Model model, @RequestParam(value = "noticeId") int noticeId) {
		return "noticeOne";
	}
	// 공지 삭제
	@GetMapping("/admin/removeNotice")
	public String removeNotice(@RequestParam(value = "noticeId") int noticeId) {
		return "redirect:/admin/noticeList";
	}
	// 공지 수정 폼
	@GetMapping("/admin/modifyNotice")
	public String modifyNotice(Model model, @RequestParam(value = "noticeId") int noticeId) {
		return "modifyNotice";
	}
	// 공지 수정 액션
	@PostMapping("/admin/modifyNotice")
	public String modifyNotice(Notice notice) {
		return "redirect:/admin/noticeOne?noticeId="+notice.getNoticeId();
	}
}
