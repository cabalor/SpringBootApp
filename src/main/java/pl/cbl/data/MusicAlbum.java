package pl.cbl.data;

public class MusicAlbum {

	private String title;
	private String band;
	private int year;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public MusicAlbum() {}
	@Override
	public String toString() {
		return "MusicAlbum [title=" + title + ", band=" + band + ", year=" + year + "]";
	}
	
	
}
