public class Video {
    private String topic;
    private int duration;

    public void setTopicAndDuration(String newTopic, int newDuration) {
        topic = newTopic;
        duration = newDuration;
    }

    public void print() {
        System.out.println("Video: " + topic + ", Duration: " + duration);
    }
}