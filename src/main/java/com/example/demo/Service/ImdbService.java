package com.example.demo.Service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

@Service
public class ImdbService {
    public String imdbIDGet(String filmAdi){
        filmAdi=filmAdi.replace(" ","+");
        String url = "https://www.imdb.com/find?q=";
        String imdbID = null;
        try{
            Document doc = Jsoup.connect(url).get();
            Element film = doc.select("a[href^=/title/tt]").first();

            if (film != null) {
                String href = film.attr("href");
                imdbID = href.split("/")[2];
                return imdbID;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public String imdbRatingGet(String filmAdi){
        String imdbID = imdbIDGet(filmAdi);
        String url = "https://www.imdb.com/"+imdbID;
        try{
            Document doc = Jsoup.connect(url).get();
            String rating = doc.select(".sc-d541859f-1").text();
            return rating;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
