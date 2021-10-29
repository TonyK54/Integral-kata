package kata;

import java.util.ArrayList;

public class Kata {

    public String getPublish() {
        return "I love the weather today.";
    }

    public String[] getTimeline() {
        String[] timelineText = {"Good game though. (1 minute ago)", "Darn! We lost! (2 minute ago)"};
        return timelineText;
    }

    public ArrayList<String> getFollowing() {
        ArrayList<String> updates = new ArrayList<>();
        String[] timeline = this.getTimeline();
        updates.add("Charlie - I'm in New York today! Anyone wants to have a coffee? (15 seconds ago)");
        updates.add(String.format("Bob - %s", timeline[0]));
        updates.add(String.format("Bob - %s", timeline[1]));
        updates.add(String.format("Alice - %s (5 minutes ago)", getPublish()));

        return updates;
    }
}
