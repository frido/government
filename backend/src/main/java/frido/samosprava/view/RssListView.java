package frido.samosprava.view;

import java.util.List;

import frido.samosprava.integration.rss.RssItem;

/**
 * RssListView
 */
public class RssListView {

    private String link;
    private List<RssItem> items;

    public RssListView(String link, List<RssItem> items){
        this.link = link;
        this.items = items;
    }
    
	public String getLink() {
		return link;
	}
	public List<RssItem> getItems() {
		return items;
	}
}