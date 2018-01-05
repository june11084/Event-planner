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
    public void checkAddedCost() {
        Event event = new Event();
        assertEquals(10, event.checkAddedCost(10));
    }

    @Test
    public void checkTotalCost() {
        Event event = new Event();
        int testCost = event.cost + 20;
        assertEquals(testCost, event.getCost()+20);
    }
}