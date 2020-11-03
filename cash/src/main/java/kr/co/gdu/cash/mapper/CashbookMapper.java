package kr.co.gdu.cash.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CashbookMapper {
	List<Map<String, Object>> selectCashInOutList();
}
