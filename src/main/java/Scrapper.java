import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scrapper {
    public static void main(String[] args) {
        final String url = "https://www.newsnow.com/us/Sports/Soccer/Premier+League/Chelsea?type=ln";

        try {
        final Document doc = Jsoup.connect(url).get();
        final Elements paragraphs = doc.getElementsByTag("a");
        final Elements contents = doc.getElementsByClass("hll");

//            for (Element e: paragraphs) {
//                if (!contents.isEmpty()) {
//                    System.out.println(e.attr("href"));
//                }
//    //            System.out.println(e.text());
//            }

            for (Element e: contents) {
                System.out.println(e.text()+"\n");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
