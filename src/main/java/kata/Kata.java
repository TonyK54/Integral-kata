package kata;

import java.util.ArrayList;

public class Kata {

    public String getPublish() {
        return "I love the weather today.";
    }

    public ArrayList<String> getTimeline() {
        ArrayList<String> timelineText = new ArrayList<>();
        timelineText.add("Good game though. (1 minute ago)");
        timelineText.add("Darn! We lost! (2 minute ago)");

        return timelineText;
    }

    public ArrayList<String> getFollowing() {
        ArrayList<String> updates = new ArrayList<>();
        ArrayList<String> timeline = this.getTimeline();
        updates.add("Charlie - I'm in New York today! Anyone wants to have a coffee? (15 seconds ago)");
        updates.add(String.format("Bob - %s", timeline.get(0)));
        updates.add(String.format("Bob - %s", timeline.get(1)));
        updates.add(String.format("Alice - %s (5 minutes ago)", getPublish()));

        return updates;
    }

    public static void main (String[] params) {
        Kata test = new Kata();
        System.out.println(test.getPublish());
        test.getTimeline().forEach(item -> {
            System.out.println(item);
        });
        test.getFollowing().forEach(item -> {
            System.out.println(item);
        });
    }
}
