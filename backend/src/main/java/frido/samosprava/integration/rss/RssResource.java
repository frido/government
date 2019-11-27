package frido.samosprava.integration.rss;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import frido.samosprava.client.JdkHttpClient;
import frido.samosprava.client.WebClient;

/**
 * RssResource
 */
public class RssResource {

    private final String link;
    private final WebClient client;
    private List<RssItem> items;

    public RssResource(final String link, final WebClient client) {
        this.link = link;
        this.client = client;
        items = new ArrayList<>();
    }

    private void load() {
        try {
            parse(client.call(link)).ifPresent(doc -> read(doc));
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Optional<Document> parse(final String content) {
        Document doc = null;
        try {
            final DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            final DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(new InputSource(new StringReader(content)));
        } catch (SAXException | IOException | ParserConfigurationException e) {
            e.printStackTrace();
        }
        return Optional.ofNullable(doc);
    }

    private void read(Document doc) {
        NodeList nList = doc.getElementsByTagName("item");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            Element eElement = (Element) nNode;
            String title = eElement.getElementsByTagName("title").item(0).getTextContent();
            String link = eElement.getElementsByTagName("link").item(0).getTextContent();
            String pubDate = eElement.getElementsByTagName("pubDate").item(0).getTextContent();
            items.add(new RssItem(title, link, pubDate));
        }
    }

    public List<RssItem> getItems() {
        load();
        return Collections.unmodifiableList(items);
    }

    public static void main(String[] args) {
        RssResource rss = new RssResource("https://www.petrzalka.sk/rss-uradna-tabula", new JdkHttpClient());
        for (RssItem item : rss.getItems()){
            System.out.println(item);
        }
    }

}