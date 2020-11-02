package kr.co.gdu.cash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.gdu.cash.mapper.NoticeMapper;
import kr.co.gdu.cash.vo.Notice;

@Service
@Transactional
public class IndexService {
	@Autowired
	private NoticeMapper noticeMapper;
	public List<Notice> getLatestNoticeList() {
		return noticeMapper.selectLatestNoiceList();
	}
}
