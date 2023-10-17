import java.sql.Ref;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public void addWater(){
        brewMaster.addWater();
    }

    public void pourMilk(){
        iceBox.orderFood();
    }

    public void loadDishwasher(){
        dishWasher.loadDishwasher();
    }

    public void setKitchenState(boolean coffee, boolean fridge, boolean dish){
        if(coffee){
            addWater();
        }
        if(fridge){
            pourMilk();
        }
        if(dish){
            loadDishwasher();
        }

    }

    public void doKitchenWork(){

    }


}
