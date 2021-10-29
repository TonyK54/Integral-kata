package kata;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {

    @Test
    void testPublish() {
        Kata publishTest = new Kata();
        assertEquals("I love the weather today.", publishTest.getPublish());
    }

    @Test
    void testTimeline() {
        Kata timelineTest = new Kata();
        ArrayList<String> timelineText = timelineTest.getTimeline();
        assertEquals("Good game though. (1 minute ago)", timelineText.get(0));
        assertEquals("Darn! We lost! (2 minute ago)", timelineText.get(1));
    }

    @Test
    void testFollowing() {
        Kata followingTest = new Kata();
        ArrayList<String> followingUpdates = followingTest.getFollowing();

        assertEquals("Charlie - I'm in New York today! Anyone wants to have a coffee? (15 seconds ago)", followingUpdates.get(0));
        assertEquals("Bob - Good game though. (1 minute ago)", followingUpdates.get(1));
        assertEquals("Bob - Darn! We lost! (2 minute ago)", followingUpdates.get(2));
        assertEquals("Alice - I love the weather today. (5 minutes ago)", followingUpdates.get(3));

    }
}
