import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void checkUserInput_Yes() {
        String ans = "yes";
        String ans1 = "Yes";
        assertEquals(true, ans.charAt(0)=='y');
        assertEquals(true, ans1.charAt(0)=='Y');
    }

    @Test
    public void check_If_UserInputCoupon_Match() {
        String couponCode = "fiveoff";
        String ans = "FIVEOFF";
        String ans1 = "fiveNotOff";
        assertEquals(true, ans.equalsIgnoreCase("fiveoff"));
        assertEquals(true, !ans1.equalsIgnoreCase("fiveoff"));
    }

    @Test
    public void checkUserInput_GuestNumber() {
        Event event = new Event(10,"y","yes", "yes");
        assertEquals(10, event.guestNumber);
    }

    @Test
    public void checkCanAddCost() {
        Event event = new Event(10,"y","yes", "yes");
        event.addCost(10);
        assertEquals(10, event.cost);
    }

    @Test
    public void checkCanReduceCost() {
        Event event = new Event(10,"y","yes", "yes");
        event.reduceCost(10);
        assertEquals(-10, event.cost);
    }

    @Test
    public void checkCanReduceCostPercentage() {
        Event event = new Event(10,"y","yes", "yes");
        event.addCost(100);
        event.reduceCostPercent(10);
        assertEquals(90, event.getFloatCost(),0.001);
    }
}