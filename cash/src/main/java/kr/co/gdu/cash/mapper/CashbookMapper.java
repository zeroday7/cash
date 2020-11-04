package kr.co.gdu.cash.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

// @Conpoment
// @Controller, @Service, @Mapper, @Repository : 스테레오타입
@Mapper
public interface CashbookMapper {
	List<Map<String, Object>> selectCashInOutList();
	Integer selectSumCashbookPriceByInOut(Map<String, Object> map);
	List<Map<String, Object>> selectCashListByMonth(Map<String, Object> map);
}
