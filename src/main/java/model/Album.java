package model;
import java.util.Date;

public class Album {

//    FIELDS/PROPERTIES
    private long id;
    private String artist;
    private  String name;
    private Date releaseDate;
    private long sales;
    private String genre;

    //    CONSTRUCTOR
    public Album() {}

    //    GETTERS AND SETTERS
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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
    public Date getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    public long getSales() {
        return sales;
    }
    public void setSales(long sales) {
        this.sales = sales;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}