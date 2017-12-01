package uk.ac.belfastmet.charts.domain;

public class Music {
	
	private String artist;
	private String name;
	private String album;
	private String image;
	private String genre;
	
	public Music(String artist, String name, String album, String image,String genre) {
		super();
		this.artist = artist;
		this.name = name;
		this.album = album;
		this.image = image;
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
