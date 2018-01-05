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
    public void takesUserInputGuest() {
        int guestNumber = 10;
        assertEquals(true, guestNumber==10);
    }

}