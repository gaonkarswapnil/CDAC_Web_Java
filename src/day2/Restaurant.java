package day2;

public class Restaurant {
	private String name, cuisine;
	private int restaurantId, branchCount;

	public Restaurant() {
	}

	public Restaurant(String name, String cuisine, int restaurantId, int branchCount) {
		this.name = name;
		this.cuisine = cuisine;
		this.restaurantId = restaurantId;
		this.branchCount = branchCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public int getBranchCount() {
		return branchCount;
	}

	public void setBranchCount(int branchCount) {
		this.branchCount = branchCount;
	}
	
	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", cuisine=" + cuisine + ", restaurantId=" + restaurantId + ", branchCount="
				+ branchCount + "]";
	}
}
