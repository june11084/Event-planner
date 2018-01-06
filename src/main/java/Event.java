
public class Event {
    public static int cost;
    public static float floatCost;

    public Event() {
          cost = 0;
          floatCost=0;
    }

    public static void addCost(int increase){
        cost += increase;
    }

    public static void reduceCost(int increase){
        cost -= increase;
    }

    public static void reduceCostPercent(int increase){
        floatCost = cost;
        floatCost = cost - ((floatCost*increase)/100);
    }

    public static float getFloatCost(){
        return floatCost;
    }

    public static int checkCanAddCost(int increase){
        cost += increase;
        return cost;
    }

    public static int checkCanReduceCost(int increase){
        cost -= increase;
        return cost;
    }

    public static int getCost(){
        return cost;
    }


}
