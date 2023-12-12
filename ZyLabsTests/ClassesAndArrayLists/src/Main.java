import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Video> videoList = new ArrayList<Video>();
        Video currVideo;
        String currTopic;
        int currDuration;
        int i;

        currTopic = scnr.next();
        while (!currTopic.equals("stop")) {
            currDuration = scnr.nextInt();

            currVideo = new Video();
            currVideo.setTopicAndDuration(currTopic, currDuration);

            videoList.add(currVideo);

            currTopic = scnr.next();
        }

        for (i = 0; i < videoList.size(); ++i) {
            currVideo = videoList.get(i);
            currVideo.print();
        }
    }
}
