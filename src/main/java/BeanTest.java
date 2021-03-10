import beans.Album;
import beans.Quote;

import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
        Album album1 = new Album(1, "Kanye West", "The college dropout", "2004", 335800, "pop");
        System.out.println(album1.getArtist());
        Album album2 = new Album(2, "Kanye West", "Late registration", "2005", 3100000, "pop");
        Album album3 = new Album(3, "Kanye West", "Yeezus", "2013", 750000, "pop");
        Album album4 = new Album(4, "Kanye West", "The life of pablo", "2016", 85000, "pop");
        Album album5 = new Album(5, "Kanye West", "Ye", "2018", 109000, "pop");

        List<Album> albumList = new ArrayList() {
        };
        albumList.add(album1);
        albumList.add(album2);
        albumList.add(album3);
        albumList.add(album4);
        albumList.add(album5);

        System.out.println("Some of Kanye's Albums");
        for (int i = 0; i < albumList.size(); i++ ){
//            System.out.println(albumList.get(i).getName());

            Album currentAlbum = albumList.get(i);
            System.out.println(currentAlbum.getId() + " " + currentAlbum.getName());

        }


        Quote quote1 =new Quote(1, "Oprah", "Winfrey", "Were you silent, or were you silenced?");
        Quote quote2 =new Quote(2, "Albert", "Einstein", "I have no special talent. I am only passionately curious");
        Quote quote3 =new Quote(3, "Steve", "Jobs", "Stay hungry, stay foolish");
        Quote quote4 =new Quote(4, "Pablo", "Picasso", "Good artists copy, great artists steal");
        Quote quote5 =new Quote(5, "The", "Buddha", "The root of suffering is attachment");


        List<Quote> quoteList = new ArrayList() {
        };
        quoteList.add(quote1);
        quoteList.add(quote2);
        quoteList.add(quote3);
        quoteList.add(quote4);
        quoteList.add(quote5);

        System.out.println("Some thought provoking quotes");
        for (int i = 0; i < quoteList.size(); i++ ){
            System.out.println(quoteList.get(i).getContent());

            Quote currentQuote = quoteList.get(i);
            System.out.println(currentQuote.getFirst_name() + " " + currentQuote.getLast_name() + "- " + currentQuote.getContent());

        }
    }

}
