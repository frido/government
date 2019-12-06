package frido.samosprava.view;

import java.util.List;

import frido.samosprava.entity.Rss;
import frido.samosprava.integration.rss.RssItem;

/**
 * RssListView
 */
public class RssListView {

    private String title;
    private String link;
    private List<RssItem> items;

    public RssListView(Rss rss, List<RssItem> items){
        this.title = rss.getTitle();
        this.link = rss.getLink();
        this.items = items;
    }
    
    public String getTitle() {
        return title;
    }
	public String getLink() {
		return link;
	}
	public List<RssItem> getItems() {
		return items;
	}
}