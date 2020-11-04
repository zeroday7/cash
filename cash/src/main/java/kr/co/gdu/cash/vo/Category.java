package kr.co.gdu.cash.vo;

public class Category {
	private String categoryName;
	private String categoryInfo;
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryInfo() {
		return categoryInfo;
	}
	public void setCategoryInfo(String categoryInfo) {
		this.categoryInfo = categoryInfo;
	}
	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + ", categoryInfo=" + categoryInfo + "]";
	}
}
