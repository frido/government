interface Rss {
  title: string;
  link: string;
  items: RssItems[];
}

interface RssItems {
  title: string;
  link: string;
  pubDate: string;
}
