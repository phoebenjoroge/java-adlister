package beans;

public class Album {
    private int id;
    private String artist;
    private String name;
    private String date;
    private double sales;
    private String genre;


    public Album(){

    }

    public Album(int id, String artist, String name, String date, double sales, String genre) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.date = date;
        this.sales = sales;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }




}
