import java.util.List;

public class NewsAgency implements NewsAgencySubject {

    private String newsTitle;
    private List<SubscriberObserver> subscriberList;

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
        notifySubscribers();  // Notify all subscribers when news is published
    }

    public List<SubscriberObserver> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<SubscriberObserver> subscriberList) {
        this.subscriberList = subscriberList;
    }

    @Override
    public void attach(SubscriberObserver subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void detach(SubscriberObserver subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (SubscriberObserver subscriber : subscriberList) {
            subscriber.update(newsTitle);
        }
    }
}
