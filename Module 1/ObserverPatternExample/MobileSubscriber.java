public class MobileSubscriber implements Observer {

    @Override
    public void update(String videoTitle) {
        System.out.println("Mobile User Notified: " + videoTitle);
    }
}