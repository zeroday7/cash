package kr.co.gdu.cash.vo;

public class Cashbook {
	private int cashbookId;
	private String cashbookKind;
	private String categoryName;
	private int cashbookPrice;
	private String cashbookContent;
	private String cashbookDate;
	private String createDate;
	private String updateDate;
	public int getCashbookId() {
		return cashbookId;
	}
	public void setCashbookId(int cashbookId) {
		this.cashbookId = cashbookId;
	}
	public String getCashbookKind() {
		return cashbookKind;
	}
	public void setCashbookKind(String cashbookKind) {
		this.cashbookKind = cashbookKind;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getCashbookPrice() {
		return cashbookPrice;
	}
	public void setCashbookPrice(int cashbookPrice) {
		this.cashbookPrice = cashbookPrice;
	}
	public String getCashbookContent() {
		return cashbookContent;
	}
	public void setCashbookContent(String cashbookContent) {
		this.cashbookContent = cashbookContent;
	}
	public String getCashbookDate() {
		return cashbookDate;
	}
	public void setCashbookDate(String cashbookDate) {
		this.cashbookDate = cashbookDate;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "Cashbook [cashbookId=" + cashbookId + ", cashbookKind=" + cashbookKind + ", categoryName="
				+ categoryName + ", cashbookPrice=" + cashbookPrice + ", cashbookContent=" + cashbookContent
				+ ", cashbookDate=" + cashbookDate + ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}	
}
