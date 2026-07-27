public class YouTubeChannel extends Subscriber {

    public void uploadVideo(String title) {
        System.out.println("New Video Uploaded: " + title);
        notifyObservers(title);
    }
}
