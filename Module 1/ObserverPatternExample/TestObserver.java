public class TestObserver {

    public static void main(String[] args) {

        YouTubeChannel channel = new YouTubeChannel();

        channel.addObserver(new MobileSubscriber());
        channel.addObserver(new DesktopSubscriber());

        channel.uploadVideo("Java Observer Pattern Tutorial");
    }
}