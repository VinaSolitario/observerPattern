public interface NewsAgencySubject {
    void attach(SubscriberObserver subscriber);
    void detach(SubscriberObserver subscriber);
    void notifySubscribers();  // Notify all subscribers when news is published
}
