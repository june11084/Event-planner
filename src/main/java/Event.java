
public class Event {
    public static int cost;

    public Event() {
          cost = 0;
    }

    public static void addCost(int increase){
        cost += increase;
    }

    public static int checkAddedCost(int increase){
        cost += increase;
        return cost;
    }

    public static int getCost(){
        return cost;
    }


}
