import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class ImdbScrape {
    public static void main(String[] args) throws IOException {

        final Document doc = Jsoup.connect("http://www.imdb.com/chart/top").get();

        for (Element e: doc.select("table.chart.full-width tr")) {
            final String title = e.select(".titleColumn a").text();
            final String rating = e.select(".imdbRating").text();

            System.out.println(title+ " -> Rating: "+ rating);
        }
    }
}
