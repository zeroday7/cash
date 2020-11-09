package kr.co.gdu.cash.vo;

public class Category {
	private String categoryName;
	private String cashbookKind;
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCashbookKind() {
		return cashbookKind;
	}
	public void setCashbookKind(String cashbookKind) {
		this.cashbookKind = cashbookKind;
	}
	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + ", cashbookKind=" + cashbookKind + "]";
	}
}
