public class DesktopSubscriber implements Observer {

    @Override
    public void update(String videoTitle) {
        System.out.println("Desktop User Notified: " + videoTitle);
    }
}