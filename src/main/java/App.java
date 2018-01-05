
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Event Cost Planner!");
        try {
            System.out.println("Please enter your number of guests");
            int guestNumber = Integer.parseInt(bufferedReader.readLine());
            Event.addCost(guestNumber);
            System.out.println(Event.getCost());
            System.out.println("Are you going to have food? Yes Or No");
            String ans = bufferedReader.readLine();
            if(ans.charAt(0)=='y'||ans.charAt(0)=='Y'){
                Event.addCost(guestNumber*4);
            } else {}
            System.out.println(Event.getCost());
            System.out.println("Are you going to have drinks? Yes Or No");
            ans = bufferedReader.readLine();
            if(ans.charAt(0)=='y'||ans.charAt(0)=='Y'){
                Event.addCost(guestNumber*2);
            } else {}
            System.out.println("Are you going to have entertainment? Yes Or No");
            ans = bufferedReader.readLine();
            if(ans.charAt(0)=='y'||ans.charAt(0)=='Y'){
                Event.addCost(20);
            } else {}
            System.out.println("Your total cost is roughly: " + Event.getCost());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
