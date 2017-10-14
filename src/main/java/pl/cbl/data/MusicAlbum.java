package pl.cbl.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MusicAlbum {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String title;
	private String band;
	private int year;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public MusicAlbum() {
	}

	public MusicAlbum(long newId, String newTitle, String newBand, int newYear) {
		id = newId;
		title = newTitle;
		band = newBand;
		year = newYear;
	}
	
	
	@Override
	public String toString() {
		return "MusicAlbum [id=" + id + ", title=" + title + ", band=" + band + ", year=" + year + "]";
	}

	

}
