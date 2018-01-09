
public class Event {
    protected int cost;
    protected float floatCost;
    protected final int guestNumber;
    protected String haveFood;
    protected String haveDrinks;
    protected String haveEntertainment;

    public Event(int guestNumber, String haveFood, String haveDrinks, String haveEntertainment) {
        this.guestNumber = guestNumber;
        this.haveFood = haveFood;
        this.haveDrinks = haveDrinks;
        this.haveEntertainment = haveEntertainment;
        cost = 0;
        floatCost = 0;
    }

    public void addCost(int increase){
        cost += increase;
    }

    public void reduceCost(int increase){
        cost -= increase;
    }

    public void reduceCostPercent(int increase){
        floatCost = cost;
        floatCost = cost - ((floatCost*increase)/100);
    }

    public float getFloatCost(){
        return floatCost;
    }

    public int getCost(){
        return cost;
    }


}
