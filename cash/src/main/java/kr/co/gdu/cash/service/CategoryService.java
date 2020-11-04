package kr.co.gdu.cash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.gdu.cash.mapper.CategoryMapper;
import kr.co.gdu.cash.vo.Category;

@Service
@Transactional
public class CategoryService {
	@Autowired CategoryMapper categoryMapper;
	public List<Category> getCategoryList() {
		return categoryMapper.selectCategoryList();
	}
}
