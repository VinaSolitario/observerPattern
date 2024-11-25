public class Subscriber implements SubscriberObserver {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String newsTitle) {
        System.out.println("Hello, " + name + "!\nNew Update: " + newsTitle + "\n");
    }
}
