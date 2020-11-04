package kr.co.gdu.cash.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.gdu.cash.vo.Category;

@Mapper
public interface CategoryMapper {
	List<Category> selectCategoryList();
}
