
public enum ResultCategory {

	STRIKE(1),
	BALL(2),
	NOTHING(0);
	
	private int categoryCode;
	
	private ResultCategory(int categoryCode) {
		this.categoryCode = categoryCode;
	}

	public int getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}
	
}
