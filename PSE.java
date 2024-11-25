import java.util.ArrayList;
import java.util.List;

public class PSE {
    public static void main(String[] args){

        // Create subscribers
        Subscriber alice = new Subscriber();
        alice.setName("Alice");

        Subscriber bob = new Subscriber();
        bob.setName("Bob");

        Subscriber charlie = new Subscriber();
        charlie.setName("Charlie");

        // Create a list of subscribers
        List<SubscriberObserver> subscriberList = new ArrayList<>();
        subscriberList.add(alice);
        subscriberList.add(bob);
        subscriberList.add(charlie);

        // Create the NewsAgency (Subject)
        NewsAgency newsAgency = new NewsAgency();
        newsAgency.setSubscriberList(subscriberList);

        // First News: Notify all subscribers
        System.out.println("First News Update:\n");
        newsAgency.setNewsTitle("Breaking News: New technology breakthrough!");

        // Bob unsubscribes
        System.out.println("\nBob is unsubscribing...\n");
        newsAgency.detach(bob);

        // Second News: Notify remaining subscribers
        System.out.println("Second News Update:\n");
        newsAgency.setNewsTitle("Breaking News: Stock market hits a record high!");
    }
}
