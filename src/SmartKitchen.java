import java.sql.Ref;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(){
        this.brewMaster = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

//    public void pourMilk(){
//        iceBox.orderFood();
//    }

//    public void loadDishwasher(){
//        dishWasher.loadDishwasher();
//    }

    public void setKitchenState(boolean coffee, boolean fridge, boolean dish){
         brewMaster.setHasWorkToDo(coffee);
         dishWasher.setHasWorkToDo(dish);
         iceBox.setHasWorkToDo(fridge);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

    //try to aim to use composition over inheritance





}
