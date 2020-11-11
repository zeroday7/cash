package kr.co.gdu.cash.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.co.gdu.cash.vo.Cashbook;

// @Conpoment
// @Controller, @Service, @Mapper, @Repository : 스테레오타입
@Mapper
public interface CashbookMapper {
	// 인수(Map) : beginRow, rowPerPage
	List<Cashbook> selectCashbookListByPage(Map<String, Object> map); 
	// 전체 cashbookList -> 엑셀파일
	List<Cashbook> selectCashbookListAll();
	
	int insertCashbook(Cashbook cashbook);
	List<Map<String, Object>> selectCashInOutList();
	Integer selectSumCashbookPriceByInOut(Map<String, Object> map);
	List<Map<String, Object>> selectCashListByMonth(Map<String, Object> map);
	List<Cashbook> selectCashBookListByDay(Map<String, Object> map);
}
