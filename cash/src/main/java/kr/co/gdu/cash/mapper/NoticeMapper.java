package kr.co.gdu.cash.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.co.gdu.cash.vo.Notice;

@Mapper // public class NoticeMapperImpl implements NoticeMapper {}
public interface NoticeMapper {
	// index화면의 최근 5개공지를 보여주는 메서드
	List<Notice> selectLatestNoiceList(); 
	List<Notice> selectNoticeListByPage(Map<String, Integer> map);
}
