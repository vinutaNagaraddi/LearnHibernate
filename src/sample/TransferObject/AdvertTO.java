package sample.TransferObject;

public class AdvertTO {
	private String userName;
	private String categoryTitle;
	private String advertTitle;
	private String message;
	
	
	public AdvertTO(String userName, String categoryTitle, String advertTitle,
			String message) {
		super();
		this.userName = userName;
		this.categoryTitle = categoryTitle;
		this.advertTitle = advertTitle;
		this.message = message;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCategoryTitle() {
		return categoryTitle;
	}
	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}
	public String getAdvertTitle() {
		return advertTitle;
	}
	public void setAdvertTitle(String advertTitle) {
		this.advertTitle = advertTitle;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
