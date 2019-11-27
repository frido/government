package frido.samosprava.integration.rss;

public class RssItem {

	private String title;
    private String link;
    private String pubDate;

    RssItem(String title, String link, String pubDate) {
        this.title = title;
        this.link = link;
        this.pubDate = pubDate;
    }

    public String getTitle() {
		return title;
	}

	public String getLink() {
		return link;
	}

	public String getPubDate() {
		return pubDate;
	}

    @Override
    public String toString() {
        return String.format("RssItem{title='%s', link='%s', pubDate='%s'}", title, link, pubDate);
    }


}
