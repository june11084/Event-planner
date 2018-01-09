
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to event Cost Planner!");
        try {
            System.out.println("Please enter your number of guests");
            int guestNumber = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Are you going to have food? Yes Or No");
            String food = bufferedReader.readLine();
            System.out.println("Are you going to have drinks? Yes Or No");
            String drinks = bufferedReader.readLine();
            System.out.println("Are you going to have entertainment? Yes Or No");
            String entertainment = bufferedReader.readLine();
            Event event = new Event(guestNumber,food,drinks,entertainment);
            event.addCost(event.guestNumber);
            if(event.haveFood.charAt(0)=='y'||event.haveFood.charAt(0)=='Y'){
                event.addCost(event.guestNumber*4);
            } else {}
            if(event.haveDrinks.charAt(0)=='y'||event.haveDrinks.charAt(0)=='Y'){
                event.addCost(event.guestNumber*2);
            } else {}
            if(event.haveEntertainment.charAt(0)=='y'||event.haveEntertainment.charAt(0)=='Y'){
                event.addCost(event.guestNumber*1);
            } else {}
            System.out.println("Your total cost is: " + event.getCost());
            if(event.getCost()>=50 && event.getCost()<100){
                System.out.println("You are eligible for 5 dollars off coupon, do you wish to apply? Yes Or No");
                entertainment = bufferedReader.readLine();
                if(entertainment.charAt(0)=='y'||entertainment.charAt(0)=='Y'){
                    do{
                        System.out.println("please type in the coupon code: fiveoff");
                        entertainment = bufferedReader.readLine();
                    }while(!entertainment.equalsIgnoreCase("fiveoff"));
                    event.reduceCost(5);
                    System.out.println("Your new total cost is: " + event.getCost());
                } else {}
            }
            if(event.getCost()>=100&& event.getCost()<150){
                System.out.println("You are eligible for 10 dollars off coupon, do you wish to apply? Yes Or No");
                entertainment = bufferedReader.readLine();
                if(entertainment.charAt(0)=='y'||entertainment.charAt(0)=='Y'){
                    do{
                        System.out.println("please type in the coupon code: fiveoff");
                        entertainment = bufferedReader.readLine();
                    }while(!entertainment.equalsIgnoreCase("fiveoff"));
                    event.reduceCost(10);
                    System.out.println("Your new total cost is: " + event.getCost());
                } else {}
            }
            if(event.getCost()>=150){
                System.out.println("You are eligible for 15% off coupon, do you wish to apply? Yes Or No");
                entertainment = bufferedReader.readLine();
                if(entertainment.charAt(0)=='y'||entertainment.charAt(0)=='Y'){
                    do{
                        System.out.println("please type in the coupon code: fifteenoff");
                        entertainment = bufferedReader.readLine();
                    }while(!entertainment.equalsIgnoreCase("fifteenoff"));
                    event.reduceCostPercent(15);
                    System.out.println("Your new total cost is: " + event.getFloatCost());
                } else {}
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
