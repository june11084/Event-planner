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
        event.reduceCost(20);
        int testCost = event.cost;
        assertEquals(testCost, event.getCost());
    }
}