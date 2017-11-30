
public class Volume {

	private int rank;
	private String name;
	private String country;
	private String place;
	private int volume;
	public Volume(int rank, String name, String country, String place, int volume) {
		super();
		this.rank = rank;
		this.name = name;
		this.country = country;
		this.place = place;
		this.volume = volume;
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
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	
	
}
