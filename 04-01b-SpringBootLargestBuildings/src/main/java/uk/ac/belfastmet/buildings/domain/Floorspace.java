package uk.ac.belfastmet.buildings.domain;

public class Floorspace {

	private int rank;
	private String name;
	private String country;
	private String place;
	private String floorArea;
	private String image;

	public Floorspace(int rank, String name, String country, String place, String floorArea, String image) {
		super();
		this.rank = rank;
		this.name = name;
		this.country = country;
		this.place = place;
		this.floorArea = floorArea;
		this.image = image;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
