import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void checkUserInputYes() {
        String ans = "yes";
        String ans1 = "Yes";
        assertEquals(true, ans.charAt(0)=='y');
        assertEquals(true, ans1.charAt(0)=='Y');
    }

    @Test
    public void checkUserInputGuestNumber() {
        int guestNumber = 10;
        assertEquals(true, guestNumber==10);
    }

    @Test
    public void checkCanAddCost() {
        Event event = new Event();
        assertEquals(10, event.checkCanAddCost(10));
    }

    @Test
    public void checkCanReduceCost() {
        Event event = new Event();
        assertEquals(-10, event.checkCanReduceCost(10));
    }

    @Test
    public void checkCorrectTotalCost() {
        Event event = new Event();
        event.addCost(20);
        int testCost = event.cost;
        assertEquals(testCost, event.getCost());
    }
}