package Klausuraufgaben;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class RequirementParser throws ClassNotFoundException {

    public static void main(String[] args) throws IOException {

        // This page has mis-nested tags: <strong>This <em>is</strong> mis-nested</em>

        String url = "https://elegant-jones-f4e94a.netlify.com/valid_doc.html";
        Document document = Jsoup.connect(url).get();

        document.body().childNodes().forEach(System.out::println);

    }

}